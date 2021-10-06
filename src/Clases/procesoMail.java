package Clases;

import static Clases.Consultas.array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class procesoMail implements Runnable {

    validacionMail valid = new validacionMail();
    //recibe curp, asunto, ruta, nombre del archivo 
    String nom, dest, subject, rout, curp_alum;
    String[] vect;

    //ESTABLECEMOSCORREO Y CONTRASEÑA
    String correo = valid.getMail();
    String contrasena = valid.getPasss();

    //TEXTO DEL CORREO
    String msn = "Buenos Dias padre de familia, Le anexamos la boleta de su hijo, Saludos.";

    //Al LLAMAR A LA  LA CLASE ESTA RECIBE: NOMBRE DEL ARCHIVO, ASUNTO DEL MSJ, RUTA DEL ARCHIVO , CURP DEL ALUMMNO
    public procesoMail(String nom_archivo, String asunto, String ruta, String curp) {
        this.nom = nom_archivo;
        this.subject = asunto;
        this.rout = ruta;
        this.curp_alum = curp;
        
    }
    
    //METODO ´PARA  CONSULTAR CORREO DEL ALUMNO
    public void buscar_dest(String curp) {
        try {

            //método para la conexion
            conexion conexion = new conexion();

            PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT correo FROM alumno WHERE curp = ? ");
            consulta.setString(1, curp);
            ResultSet resultado = consulta.executeQuery();
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                dest = resultado.getString("correo");

            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la Consulta    " + e);
        }
    }

    @Override
    public void run() {
        //busca el coreo del tutor
        buscar_dest(curp_alum);
        vect = dest.split(";");
        

        //pregunta si la ruta esta vacia
        if (rout.equals("")) {
            final String usuario = correo;
            final String pass = contrasena;
            Properties props = new Properties();

            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, pass);
                }
            });
            session.setDebug(false);

            try {
          /*      JOptionPane.showInputDialog(null,
                        "ENVIANDO BOLETA...", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);*/

                for (int i = 0; i < vect.length; i++) {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(usuario));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(vect[i]));
                    message.setSubject(subject);
                    message.setText(msn);
                    Transport.send(message);
//                    guardadoDB objeto = new guardadoDB(correo,vect[i],subject);
                }
             /*   JOptionPane.showMessageDialog(null,
                        " BOLETA enviado", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);*/

            } catch (MessagingException e) {

                JOptionPane.showMessageDialog(null, "Algo salio mal compruebe la conexion a internet.    " + e);
            }
        } else {

            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.live.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            session.setDebug(false);
            BodyPart texto = new MimeBodyPart();

            try {
            /*    JOptionPane.showMessageDialog(null,
                        "ENVIANDO BOLETA...", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);*/

                for (int i = 0; i < vect.length; i++) {
                    texto.setText(msn);
                    BodyPart adjunto = new MimeBodyPart();
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(rout)));
                    adjunto.setFileName(nom);
                    MimeMultipart multiParte = new MimeMultipart();
                    multiParte.addBodyPart(texto);
                    multiParte.addBodyPart(adjunto);
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(correo));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
                    message.setSubject(subject);
                    message.setContent(multiParte);
                    Transport t = null;
                    t = session.getTransport("smtp");
                    t.connect(correo, contrasena);
                    t.sendMessage(message, message.getAllRecipients());
                    t.close();
                }
                JOptionPane.showMessageDialog(null,
                        "BOLETA. ENVIADA", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (MessagingException ex) {

                JOptionPane.showMessageDialog(null, "Algo salio mal compruebe la conexion a internet       " + ex);
            }
        }
    }

    public void start() {
        new Thread(this).start();
    }
}

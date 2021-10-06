package Clases;

import java.net.PasswordAuthentication;
import java.security.NoSuchProviderException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Dguerrero
 */
public class validacionMail implements Runnable {

    JTextField correo;
    JPasswordField contrasena;
    JLabel error;
    
    //se establece el correo y contraseña institucionales
    String mail = "L17320806@acapulco.tecnm.mx";
    String passs = "ita20_0806";

    public String getMail() {
        return mail;
    }

    public String getPasss() {
        return passs;
    }
    

   

    @Override
    public void run() {
        Properties props = new Properties();

        final String usuario = mail;
        final String pass = passs;

        //INCIA LOS SERVICIOS PARA INICIAR SESION
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(usuario, pass);
                    }
                });
        session.setDebug(false);

        Transport transport = null;

        try {
            transport = session.getTransport("smtp");
        } catch (javax.mail.NoSuchProviderException ex) {
            Logger.getLogger(validacionMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            transport.connect();
            System.out.println("CONEXION ESTABLECIDA CORRREO");
//             JOptionPane.showMessageDialog(null,
//                    "Seleccione el Mes de la evaluación.", "Informacion",
//                    JOptionPane.INFORMATION_MESSAGE);
           
            
            
        } catch (MessagingException ex) {
            System.out.println("error en la validacionde coore "+ ex);
           
        }
    }

    public void start() {
        new Thread(this).start();
    }

}

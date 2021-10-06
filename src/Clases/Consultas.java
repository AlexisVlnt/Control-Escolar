package Clases;

import Paneles.frmObserv;
import Paneles.pnlCalif;
import Paneles.pnlGrup;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import control_escolar_form.Login;
import static control_escolar_form.Prncipal.panelCentralx;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Consultas {

    public static boolean bandera;
    pnlGrup grupito = new pnlGrup();
    //pnlCalif panelCalif = new pnlCalif();
    public static int NO_lista;

    public static DefaultTableModel alum = new DefaultTableModel();
    public static String[] gen = {"......", "Diagnostico", "Septiembre", "Octubre", "Nov/Dic", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
    public static ArrayList<String> array = new ArrayList();
    public static ArrayList<String> materias = new ArrayList();
    public static ArrayList<String> claves = new ArrayList();
    //ARREGLO PARA GUARADAR CALIF
    public static ArrayList<String> calif = new ArrayList();
    //ARREGLO PARA GUARADAR observaciones
    public static ArrayList<String> Observ = new ArrayList();

    public static ArrayList<Double> PrimerTrimestre = new ArrayList();
    public static ArrayList<Double> SegundoTrimestre = new ArrayList();
    public static ArrayList<Double> TercerTrimestre = new ArrayList();

    public static ArrayList<Double> PrimerTrimestreComple = new ArrayList();
    public static ArrayList<Double> SegundoTrimestreComple = new ArrayList();
    public static ArrayList<Double> TercerTrimestreComple = new ArrayList();
    
    public static ArrayList<Integer> arrayInasistencia = new ArrayList<Integer>();

    public static String mes_boleta = " ";

    // MODIFICACION DATOS DEL ALUMNO
    public void ModifiAlum(String nombre, String appat, String apmat, String curp, long grado, String grupo, String sexo, int edad, String nom_tutor, String appat_tutor,
            String apmat_tutor, long telefono, String correo) {

        try {
            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("UPDATE alumno SET nom_alumno=?,appat=?,apmat=?,sexo=?,edad=?,"
                    + "grado=?,grupo=?,nom_tutor=?,appat_tutor=?,apmat_tutor=?,tel_tutor=?,correo=? WHERE curp = ?");
            consulta.setString(13, curp);
            consulta.setString(1, nombre);
            consulta.setString(2, appat);
            consulta.setString(3, apmat);
            consulta.setString(4, sexo);
            consulta.setInt(5, edad);
            consulta.setLong(6, grado);
            consulta.setString(7, grupo);
            consulta.setString(8, nom_tutor);
            consulta.setString(9, appat_tutor);
            consulta.setString(10, apmat_tutor);
            consulta.setLong(11, telefono);
            consulta.setString(12, correo);

            int res = consulta.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado Exitosamente", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se registro correctamente", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null,
                        "La curp ya esta registrada, verifique sus datos", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
            if (ex.getErrorCode() == 1048) {
                JOptionPane.showMessageDialog(null,
                        "Un campo esta vacio, verifique sus datos", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
            System.out.println(ex + "  " + ex.getErrorCode());
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception ec) {
            System.out.println(ec);
        }

    }

    // ALTA DEL ALUMNO
    public void altas(String nombre, String appat, String apmat, String curp, long grado, String grupo, String sexo, int edad, String nom_tutor, String appat_tutor,
            String apmat_tutor, long telefono, String correo) {

        try {
            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("insert into alumno values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setString(1, curp);
            consulta.setString(2, nombre);
            consulta.setString(3, appat);
            consulta.setString(4, apmat);
            consulta.setString(5, sexo);
            consulta.setInt(6, edad);
            consulta.setLong(7, grado);
            consulta.setString(8, grupo);
            consulta.setString(9, nom_tutor);
            consulta.setString(10, appat_tutor);
            consulta.setString(11, apmat_tutor);
            consulta.setLong(12, telefono);
            consulta.setString(13, correo);

            int res = consulta.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado Exitosamente", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se registro correctamente", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null,
                        "La curp ya esta registrada, verifique sus datos", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
            if (ex.getErrorCode() == 1048) {
                JOptionPane.showMessageDialog(null,
                        "Un campo esta vacio, verifique sus datos", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
            System.out.println(ex + "  " + ex.getErrorCode());
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception ec) {
            System.out.println(ec);
        }

    }

    // BUSQUEDA DEL NOMBRE DEL ALUMNO SINO HAY REPETIDOS    
    public void nombre(String nombre, String appat, String apmat) {
        try {
            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("select nom_alumno, appat, apmat, grado, grupo from alumno where nom_alumno = ? && appat = ? && apmat = ?");
            consulta.setString(1, nombre);
            consulta.setString(2, appat);
            consulta.setString(3, apmat);
            ResultSet query = consulta.executeQuery();
            if (query.first()) {
                JOptionPane.showMessageDialog(null,
                        "Se encontro un nombre registrado en el Grado: " + query.getInt(4) + " y Grupo: " + query.getString(5) + "\n \n"
                        + "Por lo tanto no se puede registrar 2 personas con el mismo nombre en un mismo grado/grupo o diferente(s) grado(s)/grupo(s)", "Información",
                        JOptionPane.WARNING_MESSAGE);
                bandera = false;

            } else {
                bandera = true;
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void tabla_alumnos(int gra, String gru) {
        try {
            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("select curp, appat, apmat, nom_alumno from alumno "
                    + "where grado = ? and grupo = ? order by appat ASC;");
            consulta.setInt(1, gra);
            consulta.setString(2, gru);
            alum = new DefaultTableModel();
            ResultSet query = consulta.executeQuery();
            if (query.first()) {
                query.close();
                query = consulta.executeQuery();
                tablas(alum, query);
            }else{
                NO_lista = 0;
            }
            
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //METODO PARA BUSCAR ELALUMNO POR SU NOMBRE ***********************************************************************************************

    public void BuscarAlumnoNombre(int gra, String gru, String nomComp) {
        try {

            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("select curp, appat, apmat, nom_alumno from alumno "
                    + "where grado= ?"
                    + " AND CONCAT(nom_alumno,' ',appat,' ',apmat) LIKE '%" + nomComp + "%' "
                    + " and grupo = ? order by appat ASC; ");

            consulta.setInt(1, gra);
            consulta.setString(2, gru);

            System.out.println(consulta);

            alum = new DefaultTableModel();
            ResultSet query = consulta.executeQuery();
            tablas(alum, query);
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public DefaultTableModel tablas(DefaultTableModel auxiliar, ResultSet rs) {
        TableRowSorter<TableModel> ordena = new TableRowSorter<TableModel>(auxiliar);
        grupito.tablaAlm.setRowSorter(ordena);
        try {
            int lista = 0;
            String[] columna = {"No lista", "Curp", "Apellido Paterno", "Apellido Materno", "Nombre"};
            for (int i = 0; i < 5; i++) {
                auxiliar.addColumn(columna[i]);
            }
            while (rs.next()) //Mueve el cursor al siguiente registro llenado de tabla
            {
                //Cargar los datos en filas a la tabla modelo
                Object[] fila = new Object[5];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 5; i++) {
                    if (i == 0) {
                        lista += 1;
                        fila[i] = lista;
                        System.out.println(fila[i]);
                    } else {
                        fila[i] = rs.getObject(i);
                        System.out.println(fila[i]);
                    }
                }
                NO_lista = (int) fila[0];

                // Cargar los datos en filas a la tabla modelo
                auxiliar.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e + "8");
        }
        return auxiliar;
    }

    //BUSCAR DATOS DEL ALUMNO     *************************************************************************************************
    public void buscarDatosAlumno(String curp) {
        try {
            array.clear();
            //método para la conexion
            conexion conexion = new conexion();

            PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT curp , nom_alumno, appat, apmat, sexo, edad,grado,"
                    + " grupo, nom_tutor, appat_tutor,apmat_tutor,tel_tutor,correo from alumno where curp = ? ;");
            consulta.setString(1, curp);

            ResultSet resultado = consulta.executeQuery();

            resultado = consulta.executeQuery();
            while (resultado.next()) {
                for (int i = 1; i < 14; i++) {
                    array.add(resultado.getString(i));
                }
            }

            System.out.println(array);
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la Consulta");
        }
    }

    //BUSCAR CALIFICACIONES DEL ALUMNO POR MES***************************************************************************************************************
    public void buscarCalif(String curp, String mes) {
        try {
            calif.clear();
            //método para la conexion
            conexion conexion = new conexion();

            PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT calificacion FROM calif_mensual "
                    + "WHERE mes = ? AND curp = ? ;");
            consulta.setString(1, mes);
            consulta.setString(2, curp);

            System.out.println(consulta);
            ResultSet resultado = consulta.executeQuery();

            resultado = consulta.executeQuery();
            while (resultado.next()) {

                calif.add(resultado.getString("calificacion"));

            }

            System.out.println(calif);
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la Consulta");
        }
    }

    //obtiene el id de reporte
    public int ObtenerIdReporte() {//Método retorna o devuelve un valor entero
        //Variable auxiliar para obtener el id del Reporte
        int id = 0;//Se inicializa la variable 
        try {
            //Método para la conexion
            conexion conexion = new conexion();
            //Creación de la consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("select max(id_reporte) from reporte;");
            //Ejecución de la consulta
            ResultSet resultado = consulta.executeQuery();
            //Obtiene el valor del ultimo id
            while (resultado.next()) {
                //le suma + 1 al valor obtenido, ese valor sera ocupado para introducir el siguiente reporte ya con el id nuevo
                id = resultado.getInt(1) + 1;
            }
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al consultar el id reporte");
        }
        return id;
    }

    //Registra la hora de salida del usuario    
    public void Salida(String Hora_Salida) {//recibe la hora de salida del Usuario
        int idReporte = ObtenerIdReporte();//Obtiene el ultimo valor del id del Reporte de Bítacora
        idReporte = idReporte - 1;
        try {
            //Método para la conexion
            conexion conexion = new conexion();
            //Creación de la consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("update reporte set hora_salida = '"
                    + Hora_Salida + "' where id_reporte = '" + idReporte + "'");
            //la Ejecución de la consulta devuelve un valor entero
            int Salida = consulta.executeUpdate();
            //Si el valor es mayor a 0, entonces se guardo la salida del Usuario a ingreso al sistema
            if (Salida > 0) {
                //manda un mensaje
                System.out.println("Se Guardo la Salida");
            }
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    //Registro de la persona que accede al sistema, la fecha, hora entrada
    public void Bitacora(String Usuario, String Hora_Entrada, String fecha_acceso) throws SQLException {
        int idReporte = ObtenerIdReporte();//Obtiene el ultimo valor del id del Reporte de Bitácora        
        try {
            //Método para la conexion
            conexion conexion = new conexion();
            //Creacion de la Consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("insert into reporte values (?,?,?,?,?)");
            //Insertar los datos en su respectivo campo o columna
            consulta.setInt(1, idReporte);  //Id del Reporte          
            consulta.setString(2, Usuario); // Usuario que ingresó al sistema
            consulta.setString(3, fecha_acceso);  //Fecha en que accedió al sistema      
            consulta.setString(4, Hora_Entrada); //Hora que entró al sistema
            consulta.setString(5, "");

            int a = consulta.executeUpdate(); // La ejecución devuelve un valor entero
            //si el valor entero que devolvió es mayor a 0, es por que se guardo los datos en la base
            if (a > 0) {

            } else {//Sino se guardo, manda un mensaje
                System.out.println("No se guardo");
            }
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    //Busca al usuario en la base de datos
    public boolean BuscarUsuario(String Usuario, String Password) {
        //Se inicializa con un valor, por sino marca error
        boolean Acceso = false;//Variable auxiliar, la cual nos devolvera un true o false
        try {
            //Método para la conexion
            conexion conexion = new conexion();
            //Creacuión de la consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("select * from usuario where tipo = '"
                    + Usuario + "' AND contraseña = '" + Password + "' ");
            //Ejecución de la consulta
            ResultSet resultado = consulta.executeQuery();
            //Condición
            if (resultado.next()) {//Si encontro un registro, devuelve un true
               Login.tipo_usuario = resultado.getString(3);
                Acceso = true;
            } else {//Sino encontro nada, manda un false            
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña Incorrecto", "Acceso Denegado", 0);
                Acceso = false;
            }
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.err.println(e);
        }
        return Acceso;//Retorno o devuelve un valor
    }

    //Búsqueda del alumno a eliminar
    public void bajaAlumno(String curp) {
        try {
            //método para la conexion
            conexion conexion = new conexion();
            //Creación de la consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("delete from alumno where curp = '" + curp + "';");
            //Ejecución de la consulta
            consulta.executeUpdate();
            //Mandar Mensaje si el registro fue eliminado
            JOptionPane.showMessageDialog(null, "Alumno Eliminado");
            consulta.close();
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al eliminar, Checa Wey!!!");
        }
    }

    //Método para agregar los meses para la captura de calificaciones, recibe la curp para la consulta
    public void ValidacionMensual(String curp) {
        try {
            array.clear();
            //método para la conexion
            conexion conexion = new conexion();
            //Creación de la consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("Select distinct mes From calif_mensual Where curp = ?;");
            consulta.setString(1, curp);
            //Ejecución de la consulta
            ResultSet resultado = consulta.executeQuery();
            // Condición IF
            // Si se encuentra registro, entonces.... RELLENAR MESES
            if (resultado.first()) {
                resultado = consulta.executeQuery();
                while (resultado.next()) {
                    array.add(resultado.getString("mes"));
                }
            } else {
                array.clear();
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Consulta");
        }
    }

    //Busqueda de Alumno para Captura de Calificaciones
    public void Alumno_Calficaciones(String curp) {
        try {
            //Reiniciamos los arreglos por si ya existian datos anteriores
            materias.clear();
            claves.clear();

            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("select nom_alumno, appat, apmat, grado from alumno where curp = '" + curp + "'");
            ResultSet resultado = consulta.executeQuery();

            if (resultado.first()) {
                PreparedStatement query = conexion.getConnection().prepareStatement("select clave_materia, materia from materias where grado = ?");
                query.setInt(1, resultado.getInt("grado"));

                System.out.println(query);
                resultado = query.executeQuery();

                while (resultado.next()) {
                    materias.add(resultado.getString("materia"));
                    claves.add(resultado.getString("clave_materia"));
                }

                System.out.println(materias);
                System.out.println(claves);
                System.out.println(query + "  aaaa");
                consulta.close();
                conexion.desconectar();
                bandera = true;

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado en la base");
            }
            consulta.close();
            conexion.desconectar();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
            System.out.println("Error en la Consulta sobre el alumno para calificaciones");
        }

    }

    public void alta_calif(int id, String mes, String clave, double calif, String curp) {
        mes_boleta = mes;
        try {
            conexion conexion = new conexion();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("INSERT INTO calif_mensual VALUES (?,?,?,?,?);");
            consulta.setInt(1, id);
            consulta.setString(2, mes);
            consulta.setString(3, clave);
            consulta.setDouble(4, calif);
            consulta.setString(5, curp);
            int res = consulta.executeUpdate();
            if (res > 0) {
                
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se registro correctamente", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println(ex + "  " + ex.getErrorCode());
        } catch (Exception ec) {
            System.out.println(ec);
        }
    }

    //Metodo para que al momento de registrar una nueva calificacion pero el mes ya se repitio mande un mensaje
    public void verificar_mes(String curp, String mes, String tabla) {
        try {
            array.clear();
            //método para la conexion
            conexion conexion = new conexion();

            switch (tabla) {
                case "calif_mesual":
                    //Creación de la consulta
                    PreparedStatement consulta = conexion.getConnection().prepareStatement("Select distinct mes From " + tabla + " Where curp = ? and mes = ?;");
                    consulta.setString(1, curp);
                    consulta.setString(2, mes);
                    //Ejecución de la consulta
                    ResultSet resultado = consulta.executeQuery();
                    // Condición IF
                    // Si se encuentra registro, entonces.... RELLENAR MESES
                    if (resultado.first()) {
                        JOptionPane.showMessageDialog(null,
                                "Mes registrado anteriormente, Seleccione otro", "Informacion",
                                JOptionPane.WARNING_MESSAGE);
                        bandera = false;
                        System.out.println(bandera + "         jvkegkkgnr");
                    } else {
                        bandera = true;
                        System.out.println(bandera + "         jvkegkkgnr");
                    }
                    consulta.close();
                    break;

                case "listas":
                    //Creación de la consulta
                    PreparedStatement query = conexion.getConnection().prepareStatement("Select mes From " + tabla + " Where grado_grupo = ?;");
                    query.setString(1, curp);
                    //Ejecución de la consulta
                    ResultSet res = query.executeQuery();
                    // Condición IF
                    // Si se encuentra registro, entonces.... RELLENAR MESES
                    if (res.first()) {
                        array.add(res.getString(1));
                    }
                    query.close();
                    break;
            }
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Consulta");
        }
    }

    public void promedios_trimestral(String id, String clave, Double prom, String curp, int trimestre) {//''''''''''''''''''''''''''''''''''''''''
        try {
            //método para la conexion
            conexion conexion = new conexion();
            //Creación de la consulta
            PreparedStatement consulta = conexion.getConnection().prepareStatement("insert into calif_trimestre values (?,?,?,?,?);");
            consulta.setString(1, id);
            consulta.setString(2, clave);
            consulta.setDouble(3, prom);
            consulta.setString(4, curp);
            consulta.setInt(5, trimestre);
            //Ejecución de la consulta
            int resultado = consulta.executeUpdate();
            // Condición IF
            // Si se encuentra registro, entonces.... RELLENAR Las calificaciones en los trimestres
            if (resultado > 0) {
                System.out.println("SE A REGISTRADOla materia  " + clave + "CORRECTAMENTE el trimstre : " + trimestre);
            } else {
                JOptionPane.showMessageDialog(null,
                        "No se registro correctamente", "Informacion",
                        JOptionPane.ERROR_MESSAGE);
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la Consulta");
            System.out.println(e + "   promedios tri s");
        }
    }
    
    public void promedios_trimestral_update(String clave, double promediar, String curp, int trimestre){
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("update calif_trimestre"
                    + " set calificacion = '"+promediar+"' where curp = '"+curp+"' and "
                    + "clave_materia = '"+clave+"'  and trimestre = '"+trimestre+"' ;");
            int modificacion = query.executeUpdate();
            
            if (modificacion > 0) {
                //JOptionPane.showMessageDialog(null, "Se registro modificacion de manera correcta");
            }else{
               // JOptionPane.showMessageDialog(null, "Se registro modificacion de manera incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de modificacion promedios trimestrales"+e);
        }
    }

    public double promedio(String meses, String curp, String clave_materia) {//???????????????????????????????????????????????????????????
        double media = 0;

        switch (meses) {

            case "Nov/Dic":
                try {
                    //método para la conexion
                    conexion conexion = new conexion();
                    //Creación de la consulta
                    PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT avg(calificacion) as prom FROM control_escolar.calif_mensual "
                            + "where curp = ? and clave_materia = ? and (mes = \"Septiembre\" or mes = \"Octubre\" or mes = \"Nov/Dic\") ;");
                    consulta.setString(1, curp);
                    consulta.setString(2, clave_materia);
                    System.out.println(consulta);
                    //Ejecución de la consulta
                    ResultSet resultado = consulta.executeQuery();
                    // Condición IF
                    // Si se encuentra registro, entonces.... sumar las calificaciones
                    if (resultado.first()) {
                        media = resultado.getDouble("prom");
                    } else {
                        System.out.println("noooooo encotro");
                    }

                    consulta.close();
                    conexion.desconectar();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error en la Consulta");
                    System.out.println(e);
                }
                break;

            case "Marzo":
                try {
                    //método para la conexion
                    conexion conexion = new conexion();
                    //Creación de la consulta
                    PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT avg(calificacion)as prom FROM control_escolar.calif_mensual "
                            + "where curp = ? and clave_materia = ? and (mes = \"Enero\" or mes = \"Febrero\" or mes = \"Marzo\"); ");
                    consulta.setString(1, curp);
                    consulta.setString(2, clave_materia);
                    //Ejecución de la consulta
                    ResultSet resultado = consulta.executeQuery();
                    // Condición IF
                    // Si se encuentra registro, entonces.... sumar las calificaciones
                    if (resultado.first()) {
                        media = resultado.getDouble("prom");
                    } else {
                        System.out.println("noooooo encotro");
                    }

                    consulta.close();
                    conexion.desconectar();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error en la Consulta");
                }
                break;

            case "Junio":
                try {
                    //método para la conexion
                    conexion conexion = new conexion();
                    //Creación de la consulta
                    PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT avg(calificacion)as prom FROM control_escolar.calif_mensual "
                            + "where curp = ? and clave_materia = ? and (mes = \"Abril\" or mes = \"Mayo\" or mes = \"Junio\"); ");
                    consulta.setString(1, curp);
                    consulta.setString(2, clave_materia);
                    //Ejecución de la consulta
                    ResultSet resultado = consulta.executeQuery();
                    // Condición IF
                    if (resultado.first()) {
                        media = resultado.getDouble("prom");
                    } else {
                        System.out.println("nooooo encontro");
                    }
                    // Si se encuentra registro, entonces.... sumar las calificaciones
                    // media = resultado.getDouble("prom");
                    consulta.close();
                    conexion.desconectar();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error en la Consulta");
                }
                break;
        }
        System.out.println("el promdedio es " + media);
        return media;
    }
    
    public void update_promedios_finales(double promedio, String curp, String clave){
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("update promedios set"
                    + " promedio = '"+promedio+"' where curp = '"+curp+"'" +
            "and clave_materia = '"+clave+"';");
            int modificacion = query.executeUpdate();
            
            if (modificacion > 0) {
               // JOptionPane.showMessageDialog(null, "Modificacion de Promedios finales de manera correcta");
            }else{
                System.out.println("Todavia no hay promedios ingresados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar promedios finales: "+e);
        }
    }

    public String llave_primaria() {//==========================================================
        String auxiliar = "tr", variable = ""; //Se declara la variable auxiliar con el valor "tr"
        try {
            conexion connect = new conexion();
            int num = 0;
            char z, m, s;
            PreparedStatement consulta = connect.getConnection().prepareStatement("select id_trimestre from calif_trimestre order by id_trimestre desc");
            ResultSet res = consulta.executeQuery();
            if (res.first()) {
                variable = res.getString("id_trimestre");
            }
            if (variable.equalsIgnoreCase("")) {
                z = '0';
                m = '0';
                s = '0';
                variable = String.valueOf(s) + String.valueOf(m) + String.valueOf(z);
                num = Integer.parseInt(variable);
            } else {
                z = variable.charAt(4);
                m = variable.charAt(3);
                s = variable.charAt(2);
                variable = String.valueOf(s) + String.valueOf(m) + String.valueOf(z);
                num = Integer.parseInt(variable) + 1;
            }
            if (num <= 9) {
                auxiliar = auxiliar + "00" + String.valueOf(num);
            }
            if (num > 9 && num <= 99) {
                auxiliar = auxiliar + "0" + String.valueOf(num);
            }
            if (num > 99 && num <= 999) {
                auxiliar = auxiliar + String.valueOf(num);
            }
            consulta.close();
            connect.desconectar();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return auxiliar;
    }

    public int llave_num(String id, String tabla) {//======================================================
        int auxiliar = 0;
        try {
            conexion connect = new conexion();
            PreparedStatement consulta = connect.getConnection().prepareStatement("select "+id+" from " + tabla + " order by "+id+" desc");
            
            ResultSet res = consulta.executeQuery();
            if (res.first()) {
                auxiliar = res.getInt(1);
            }
            if (auxiliar == 0) {
                auxiliar += 1;
            } else {
                auxiliar += 1;
            }
            consulta.close();
            connect.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el id"+ex);
        }
        return auxiliar;
    }
    
    public boolean ValidacionInasistencia(String curp, String mes){
        boolean bandera = false;
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareCall("select dias from inasistencia"
                    + " where curp = '"+curp+"' and mes = '"+mes+"' ;");
            ResultSet busqueda = query.executeQuery();
            if (busqueda.first()) {
                bandera = true;
            }
            query.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la validacion de Inasistencia"+e);
        }
        
        return bandera;
    }

    public void IngresarInasistencia(int id, String curp, String mes, int dias) {
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("insert into inasistencia values (?, ?, ?, ?) ");
            query.setInt(1, id);
            query.setString(2, curp);
            query.setString(3, mes);
            query.setInt(4, dias);
            int respuesta = query.executeUpdate();
            if (respuesta > 0) {
                //   JOptionPane.showMessageDialog(null, "Registro de inasistencia con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se registro inasistencia");
            }
            conexion.desconectar();
            query.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar la inasistencia");
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Boleta Interna y Sep
    public void ObtenerInasistencias(String curp) {
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select dias from inasistencia"
                    + " where curp = '"+curp+"' ; ");
            ResultSet resultado = query.executeQuery();
            while(resultado.next()){
                arrayInasistencia.add(resultado.getInt(1));                
            }
            conexion.desconectar();
            query.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta, para obtener inasistencias");
        }
    }

    //Obtener los promedios finales de cada una de las materias
    public void ObtenerCalifTrimestres(int trimestre, String curp, String grado) {
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement(" select calificacion from calif_trimestre \n"
                    + "where clave_materia != 'infrob00" + grado + "' and  clave_materia !=  'edusoc00" + grado + "'\n"
                    + "and curp = '" + curp + "' and trimestre = '" + trimestre + "';");
            ResultSet resultado = query.executeQuery();

            if (trimestre == 1) {
                while (resultado.next()) {
                    PrimerTrimestre.add(resultado.getDouble("calificacion"));
                }
            } else if (trimestre == 2) {
                while (resultado.next()) {
                    SegundoTrimestre.add(resultado.getDouble("calificacion"));
                }
            } else if (trimestre == 3) {
                while (resultado.next()) {
                    TercerTrimestre.add(resultado.getDouble("calificacion"));
                }
            }
            conexion.desconectar();
            query.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Boleta Interna
    public double getPromediosMensuales(String curp, String grado, String mes) {
        double promedioFinal = 0;
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select  round(avg(calificacion))  as calificacion from calif_mensual\n"
                    + "where curp = '" + curp + "' and clave_materia != 'edusoc00" + grado + "'and clave_materia != 'infrob00" + grado + "'\n"
                    + "and mes = '" + mes + "'; ");
            ResultSet resultado = query.executeQuery();
            if (resultado.first()) {
                promedioFinal = resultado.getDouble("calificacion");
            } else {
                JOptionPane.showMessageDialog(null, "Promedio mensual no realizado");
            }
            query.close();
            conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return promedioFinal;
    }

    //Boleta Interna Y SEP
    public double getPromediosTrimestre(String curp, String grado, int trimestre) {
        double promedioFinal = 0;
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select  round(avg(calificacion))  as calificacion from calif_trimestre\n"
                    + "where curp = '" + curp + "' and clave_materia != 'edusoc00" + grado + "'and clave_materia != 'infrob00" + grado + "'\n"
                    + "and trimestre = '" + trimestre + "'; ");
            ResultSet resultado = query.executeQuery();
            if (resultado.first()) {
                promedioFinal = resultado.getDouble("calificacion");

            } else {
                JOptionPane.showMessageDialog(null, "Promedio mensual final no realizado");
            }
            query.close();
            conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return promedioFinal;
    }

    //Boleta Interna
    public void CalifTrimestreComple(int trimestre, String grado, String curp) {
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select  calificacion from calif_trimestre\n"
                    + "where curp = '" + curp + "' and clave_materia in ('edusoc00" + grado + "', 'infrob00" + grado + "')\n"
                    + "and trimestre = '" + trimestre + "'; ");
            ResultSet resultado = query.executeQuery();

            if (trimestre == 1) {

                while (resultado.next()) {
                    PrimerTrimestreComple.add(resultado.getDouble("calificacion"));
                }
            } else if (trimestre == 2) {
                while (resultado.next()) {
                    SegundoTrimestreComple.add(resultado.getDouble("calificacion"));
                }
            } else if (trimestre == 3) {
                while (resultado.next()) {
                    TercerTrimestreComple.add(resultado.getDouble("calificacion"));
                }
            }
            query.close();
            conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Buscar el ultimo trimestre en la BD para implementarlo en la boleta
    public boolean BuscarUltimoTrimestre(String curp, int trimestre) {
        boolean encontrado = false;
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select calificacion from calif_trimestre where "
                    + "curp = '" + curp + "' and trimestre = '"+trimestre+"'");
            ResultSet resultado = query.executeQuery();
            if (resultado.next()) {
           //     JOptionPane.showMessageDialog(null, "Trimestre Agregado");
                encontrado = true;
            }
            
            conexion.desconectar();
            resultado.close();
            query.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return encontrado;
    }

    public boolean BuscarPromedioFinal(String curp) {
        boolean encontrado = false;
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareCall(" select promedio from promedios "
                    + "where curp = '" + curp + "' ");
            ResultSet resultado = query.executeQuery();
            if (resultado.next()) {
               // JOptionPane.showMessageDialog(null, "Promedios finales encontrados");
                encontrado = true;
            }
            
            resultado.close();
            query.close();
            conexion.desconectar();
        } catch (Exception e) {
        }
        return encontrado;
    }

    public void setPromedios(int id, double promedio, String clave_materia, String curp) {
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("insert into promedios values (?,?,?,?) ");
            query.setInt(1, id);
            query.setDouble(2, promedio);
            query.setString(3, clave_materia);
            query.setString(4, curp);
            int resultado = query.executeUpdate();

            if (resultado > 0) {
             //   JOptionPane.showMessageDialog(null, "Promedio Ingresado");
            } else {
                JOptionPane.showMessageDialog(null, "Promedio no Ingresado");
            }
            
            query.close();
            conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Ingresar promedio");
        }
    }

    public void getPromediosTrimestre(int trimestre, String curp) {
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select round(calificacion,1) as calificacion from calif_trimestre\n"
                    + " where curp = '" + curp + "' and trimestre = '" + trimestre + "';");
            ResultSet resultado = query.executeQuery();

            if (trimestre == 1) {
                //  JOptionPane.showMessageDialog(null, "Arreglo 1");
                while (resultado.next()) {
                    PrimerTrimestre.add(resultado.getDouble("calificacion"));
                }
            } else if (trimestre == 2) {
                //  JOptionPane.showMessageDialog(null, "Arreglo 2");
                while (resultado.next()) {
                    SegundoTrimestre.add(resultado.getDouble("calificacion"));
                }
            } else if (trimestre == 3) {
                // JOptionPane.showMessageDialog(null, "Arreglo 3");
                while (resultado.next()) {
                    TercerTrimestre.add(resultado.getDouble("calificacion"));
                }
            }
            query.close();
            conexion.desconectar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conseguir Promedios de los Trimestres");
        }
    }

    public double getPromedioFinalSep(String curp, String grado) {
        double promedioSEP = 0;
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareCall("select avg(calificacion) as calificacion from calif_trimestre\n"
                    + "where curp =  '" + curp + "' and clave_materia != 'edusoc00" + grado + "' and clave_materia != 'infrob00" + grado + "'\n"
                    + " and trimestre between 1 and 3; ");
            ResultSet resultado = query.executeQuery();
            if (resultado.first()) {
             //   JOptionPane.showMessageDialog(null, "promedio sep obtenido");
                promedioSEP = resultado.getDouble(1);
            } else {
                JOptionPane.showMessageDialog(null, "No se obtuvo el promedio sep");
            }
            query.close();
            conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta al obtener promedio final sep");
        }
        return promedioSEP;
    }

    public void materias(int grado) {
        try {
            conexion conexion = new conexion();
            claves.clear();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT materia FROM control_escolar.materias where grado = ? and materia != 'Informática y Robótica' and materia != 'Educación Socioemocional';");
            consulta.setInt(1, grado);
            ResultSet res = consulta.executeQuery();

            while (res.next()) {
                claves.add(res.getString("materia"));
            }

            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void guardar_listas(String grado_grupo, String mes, String direccion, String tipo_de_consulta) {
        try {
            switch (tipo_de_consulta) {
                case "insert":
                    conexion conexion = new conexion();
                    PreparedStatement consulta = conexion.getConnection().prepareStatement("insert into listas values (?,?)");
                    consulta.setString(1, grado_grupo);
                    consulta.setString(2, mes);
                    //consulta.setString(3, direccion);

                    int resultado = consulta.executeUpdate();

                    if (resultado > 0) {
                        JOptionPane.showMessageDialog(null, "Lista guardada");
                    }
                    consulta.close();
                    conexion.desconectar();
                    break;

                case "update":
                    conexion con = new conexion();
                    PreparedStatement query = con.getConnection().prepareStatement("UPDATE listas SET `mes` = ? WHERE (`grado_grupo` = ?);");
                    query.setString(1, mes);
                    query.setString(2, grado_grupo);

                    int res = query.executeUpdate();

                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Lista guardada");
                    }
                    query.close();
                    con.desconectar();
                    break;
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Ingresar promedio" + e);
        }
    }

    
    public static int tieneObser;
    public void VerificarObserv(String curp) {
       tieneObser = 111;
       
        try {
            
            conexion conexion = new conexion();
            Observ.clear();
            PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT "
                    + "trimestre FROM observaciones WHERE curp =?;");
            consulta.setString(1, curp);
            ResultSet res = consulta.executeQuery();
            System.out.println(consulta);
            
            if (res.first()) {
                res = consulta.executeQuery();
                while (res.next()) {
                    Observ.add(res.getString("trimestre"));
                }

                switch (Observ.size()) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Este Alumno  Tiene  Observación Registrada\n"
                                + "Del Trimestre:" + Observ.get(0));
                        tieneObser=1;

                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Este Alumno  Tiene  Observación Registrada\n"
                                + "Del Trimestre:" + Observ.get(0) + "\n" + Observ.get(1));
                        tieneObser=2;  
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Este Alumno  Tiene  Observación Registrada\n"
                                + "Del Trimestre: " + Observ.get(0) + "\n" + Observ.get(1) + "\n" + Observ.get(2));
                        tieneObser=3;
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Este Alumno no Tiene ninguna Observación Registrada"
                        + "");
                tieneObser=0;

            }

            System.out.println(Observ);

            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public String textObserv(String curp, String mes) {

        String texto = "";
        try {
            conexion conexion = new conexion();

            PreparedStatement consulta = conexion.getConnection().prepareStatement("SELECT observacion  FROM observaciones "
                    + "WHERE curp =? AND trimestre=?");
            consulta.setString(1, curp);
            consulta.setString(2, mes);
            ResultSet res = consulta.executeQuery();
            System.out.println(consulta);

            while (res.next()) {
                texto = res.getString("observacion");
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return texto;
    }
    
    public void nuevaObserv(String curp,String mes, String observ){
        try {
            conexion conexion = new conexion();

            PreparedStatement consulta = conexion.getConnection().prepareStatement("INSERT INTO observaciones (`trimestre`, `observacion`, `curp`) "
                    + "VALUES  (?,?,?)");
            consulta.setString(1, mes);
            consulta.setString(2, observ);
            consulta.setString(3, curp);
           
            int res = consulta.executeUpdate();
            System.out.println(consulta);
           
            if (res>0) {
                JOptionPane.showMessageDialog(null, "Registrado con extito");
                frmObserv.txtArea.setEnabled(false);
                frmObserv.btnGuardar.setEnabled(false);
                
            }
            consulta.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No Registrado ");
            System.out.println(e);
        }        
    }
    
    public static ArrayList<Double> arregloCalifMensuales = new ArrayList();
    //Método para obtener las calificaciones mensuales
    public void getCalifMensuales(String curp, String mes){
       
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("select calificacion"
                    + " from calif_mensual where curp = '"+curp+"' "
                    + "and mes = '"+mes+"';");
            ResultSet r = query.executeQuery();

                while(r.next()){            
                arregloCalifMensuales.add(r.getDouble(1));
                }
            query.close();
            conexion.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de busqueda de calificaciones"
                    + " mensuales");
        }
    }
    
    public void setModificacionCalif(double calif, String curp, String mes, String clave){
        try {
            conexion conexion = new conexion();
            PreparedStatement query = conexion.getConnection().prepareStatement("update calif_mensual set "
                    + "calificacion = '"+calif+"' where curp = '"+curp+"' and"
                    + " mes = '"+mes+"' and clave_materia = '"+clave+"';");
            int actualizacion  = query.executeUpdate();
            if (actualizacion > 0) {
               // JOptionPane.showMessageDialog(null, "Modificacion Realizada");
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar las calificaciones");
        }
    }
}

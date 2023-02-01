package Modelo;

import java.util.Properties;
import java.util.Scanner;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Email {

    public void enviarEmail(String correoDestino) throws MessagingException {
        //ENVIAR CORREO: CON TEXTO Y CON ARCHIVO ADJUNTO
        //Scanner lectura = new Scanner(System.in);

        String correo = "mongebyron46@gmail.com";
        String contra = "cjqntdlnibofgbvc"; //En esta parte se debe colocar la contraseña generada de google

        //System.out.println("Ingrese el correo del destinatario");

        //String auxcorreo = lectura.nextLine();
        //String correoDestino = auxcorreo;
        //String correoDestino = "skinsmattyrich@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.user", correo);
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        ////////////Enviar archivo Adjunto/////////////////
        BodyPart texto = new MimeBodyPart();
        texto.setText(" Aqui va el texto que quiero enviar"); //Aqui va el texto que encabezara al documento enviado
        BodyPart adjunto = new MimeBodyPart();
        adjunto.setDataHandler(new DataHandler(new FileDataSource("C:\\Users\\monge\\Downloads\\DG. Importante. Tercer ciclo B.pdf"))); //Aqui va la ruta del archivo que deseo enviar
        adjunto.setFileName("DG. Importante. Tercer ciclo B.pdf");//Aqui va el nombre del archivo que estoy enviado mas su extension
        MimeMultipart m = new MimeMultipart();
        m.addBodyPart(texto);
        m.addBodyPart(adjunto);
        /////////////////////////////////////////////////

        MimeMessage adjunto2 = new MimeMessage(session);

        MimeMessage mensaje = new MimeMessage(session);

        adjunto2.setFrom(new InternetAddress(correo));
        adjunto2.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
        adjunto2.setContent(m); // PARA ARCHIVO ADJUNTO

        mensaje.setFrom(new InternetAddress(correo));
        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
        adjunto2.setSubject("PRUEBA"); //Aqui va el asunto del email
        Transport transport = session.getTransport("smtp");
        transport.connect(correo, contra);
        transport.sendMessage(adjunto2, adjunto2.getAllRecipients());
        transport.close();

        //System.out.println("Correo enviado");
    }
}


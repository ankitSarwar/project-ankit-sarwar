package org.geekster;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {

        return new PasswordAuthentication(MailConstants.SENDER, "rdniglukrkisbmcf"); //this is my passworld i have been genreted
    }




}

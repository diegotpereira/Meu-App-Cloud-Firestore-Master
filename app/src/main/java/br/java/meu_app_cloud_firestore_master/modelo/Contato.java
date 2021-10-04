package br.java.meu_app_cloud_firestore_master.modelo;

import com.google.firebase.firestore.DocumentId;

public class Contato {

    @DocumentId
    private String documentoId;
    private String nomeString;
    private String sobreNomeString;
    private String emailString;

    public Contato() {
    }

    public Contato(String nomeString, String sobreNomeString, String emailString) {
        this.nomeString = nomeString;
        this.sobreNomeString = sobreNomeString;
        this.emailString = emailString;
    }

    public String getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(String documentoId) {
        this.documentoId = documentoId;
    }

    public String getNomeString() {
        return nomeString;
    }

    public void setNomeString(String nomeString) {
        this.nomeString = nomeString;
    }

    public String getSobreNomeString() {
        return sobreNomeString;
    }

    public void setSobreNomeString(String sobreNomeString) {
        this.sobreNomeString = sobreNomeString;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }
}

package br.edu.ifrn.Modelo;


public class Chamado {
    
    private long id;
    
    private String assunto;
    
    private String mensagem;
    
    private Status status;

    @Override
    public String toString() {
        return "-------------------------------------------------------------/n"+
               "  Chamado  ID: " + id + 
               " /n   Assunto: " + assunto + 
               " /n  Mensagem: " + mensagem + 
               " /n    Status: " + status + 
               "-------------------------------------------------------------/n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chamado other = (Chamado) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}

package br.edu.ifrn.controllers;

import br.edu.ifrn.Modelo.Chamado;
import br.edu.ifrn.Modelo.Status;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("chamados")
public class ChamadoController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<Chamado> listaChamados() {

        Chamado c1 = new Chamado();
        c1.setAssunto("Assunto 01");
        c1.setMensagem("Mensagem 01");
        c1.setStatus(Status.PENDENTE);

        Chamado c2 = new Chamado();
        c2.setAssunto("Assunto 02");
        c2.setMensagem("Mensagem 02");
        c2.setStatus(Status.FECHADO);

        Chamado c3 = new Chamado();
        c3.setAssunto("Assunto 03");
        c3.setMensagem("Mensagem 03");
        c3.setStatus(Status.NOVO);

        Chamado c4 = new Chamado();
        c4.setAssunto("Assunto 04");
        c4.setMensagem("Mensagem 04");
        c4.setStatus(Status.PENDENTE);

        Chamado c5 = new Chamado();
        c5.setAssunto("Assunto 05");
        c5.setMensagem("Mensagem 05");
        c5.setStatus(Status.FECHADO);

        List<Chamado> ListaChamados = new ArrayList<>();
        ListaChamados.add(c1);
        ListaChamados.add(c2);
        ListaChamados.add(c3);
        ListaChamados.add(c4);
        ListaChamados.add(c5);

        return ListaChamados;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/")
    public Chamado getChamdados(@PathParam("id") long id) {
        Chamado c1 = new Chamado();
        c1.setId(id);
        c1.setAssunto("Assunto " + id);
        c1.setMensagem("Mensagem " + id);
        c1.setStatus(Status.NOVO);
        return c1;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response create(Chamado chamado) {
        System.out.println(chamado.toString());
        return Response.status(Response.Status.OK).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response update(Chamado chamado) {
        System.out.println(chamado.toString());
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("{id}/")
    public Response delete(@PathParam("id") long id) {
        System.out.println("Deletando ID: " + id);
        return Response.status(Response.Status.OK).build();
    }
}

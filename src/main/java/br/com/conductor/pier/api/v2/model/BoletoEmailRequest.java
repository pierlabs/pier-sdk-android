package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation with the parameters required to send a Ticket by email
 **/
@ApiModel(description = "Representation with the parameters required to send a Ticket by email")
public class BoletoEmailRequest  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("parametros")
  private Object parametros = null;

  
  /**
   * Email to send the ticket
   **/
  @ApiModelProperty(value = "Email to send the ticket")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Identification of notification template
   **/
  @ApiModelProperty(value = "Identification of notification template")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Map of parameters used in creating the email template
   **/
  @ApiModelProperty(value = "Map of parameters used in creating the email template")
  public Object getParametros() {
    return parametros;
  }
  public void setParametros(Object parametros) {
    this.parametros = parametros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoEmailRequest {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  idTemplateNotificacao: ").append(idTemplateNotificacao).append("\n");
    sb.append("  parametros: ").append(parametros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

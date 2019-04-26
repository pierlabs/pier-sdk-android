package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o com os par\u00E2mentros necess\u00E1rios para envio de Boleto por email
 **/
@ApiModel(description = "Representa\u00E7\u00E3o com os par\u00E2mentros necess\u00E1rios para envio de Boleto por email")
public class BoletoEmailRequest  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("parametros")
  private Object parametros = null;

  
  /**
   * Email para envio do boleto
   **/
  @ApiModelProperty(value = "Email para envio do boleto")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Identifica\u00E7\u00E3o do template de notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o do template de notifica\u00E7\u00E3o")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Mapa de par\u00E2metros utilizados na cria\u00E7\u00E3o do template do email
   **/
  @ApiModelProperty(value = "Mapa de par\u00E2metros utilizados na cria\u00E7\u00E3o do template do email")
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

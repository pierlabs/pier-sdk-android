package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros para envio do termo por e-mail
 **/
@ApiModel(description = "Par\u00E2metros para envio do termo por e-mail")
public class AcordoEmailRequest  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("parametros")
  private Object parametros = null;

  
  /**
   * Email do destinat\u00E1rio
   **/
  @ApiModelProperty(value = "Email do destinat\u00E1rio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Identificador do modelo de e-email
   **/
  @ApiModelProperty(value = "Identificador do modelo de e-email")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Par\u00E2metros para substitui\u00E7\u00E3o no modelo do e-mail.
   **/
  @ApiModelProperty(value = "Par\u00E2metros para substitui\u00E7\u00E3o no modelo do e-mail.")
  public Object getParametros() {
    return parametros;
  }
  public void setParametros(Object parametros) {
    this.parametros = parametros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoEmailRequest {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  idTemplateNotificacao: ").append(idTemplateNotificacao).append("\n");
    sb.append("  parametros: ").append(parametros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

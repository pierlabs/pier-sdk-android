package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{boleto_email_request_description}}}
 **/
@ApiModel(description = "{{{boleto_email_request_description}}}")
public class BoletoEmailRequest  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("idTemplateNotificacao")
  private Long idTemplateNotificacao = null;
  @SerializedName("parametros")
  private Object parametros = null;

  
  /**
   * {{{boleto_email_request_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_email_request_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{boleto_email_request_id_template_notificacao_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_email_request_id_template_notificacao_value}}}")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * {{{boleto_email_request_parametros_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_email_request_parametros_value}}}")
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



package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{template_notificacao_response_description}}}
 **/
@ApiModel(description = "{{{template_notificacao_response_description}}}")
public class TemplateNotificacaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConfiguracaoEmail")
  private Long idConfiguracaoEmail = null;
  public enum TipoLayoutEnum {
     RECUPERAR_SENHA,  FATURA_POR_EMAIL,  VALIDAR_DISPOSITIVO,  NOTIFICACAO_EMAIL, 
  };
  @SerializedName("tipoLayout")
  private TipoLayoutEnum tipoLayout = null;
  public enum TipoNotificacaoEnum {
     SMS,  PUSH_APNS,  PUSH_FCM,  PUSH_GCM,  EMAIL, 
  };
  @SerializedName("tipoNotificacao")
  private TipoNotificacaoEnum tipoNotificacao = null;
  @SerializedName("templatePadrao")
  private String templatePadrao = null;
  @SerializedName("remetente")
  private String remetente = null;
  @SerializedName("assunto")
  private String assunto = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;

  
  /**
   * {{{template_notificacao_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{template_notificacao_response_id_configuracao_email_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_id_configuracao_email_value}}}")
  public Long getIdConfiguracaoEmail() {
    return idConfiguracaoEmail;
  }
  public void setIdConfiguracaoEmail(Long idConfiguracaoEmail) {
    this.idConfiguracaoEmail = idConfiguracaoEmail;
  }

  
  /**
   * {{{template_notificacao_response_tipo_layout_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_tipo_layout_value}}}")
  public TipoLayoutEnum getTipoLayout() {
    return tipoLayout;
  }
  public void setTipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
  }

  
  /**
   * {{{template_notificacao_response_tipo_notificacao_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_tipo_notificacao_value}}}")
  public TipoNotificacaoEnum getTipoNotificacao() {
    return tipoNotificacao;
  }
  public void setTipoNotificacao(TipoNotificacaoEnum tipoNotificacao) {
    this.tipoNotificacao = tipoNotificacao;
  }

  
  /**
   * {{{template_notificacao_response_template_padrao_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_template_padrao_value}}}")
  public String getTemplatePadrao() {
    return templatePadrao;
  }
  public void setTemplatePadrao(String templatePadrao) {
    this.templatePadrao = templatePadrao;
  }

  
  /**
   * {{{template_notificacao_response_remetente_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_remetente_value}}}")
  public String getRemetente() {
    return remetente;
  }
  public void setRemetente(String remetente) {
    this.remetente = remetente;
  }

  
  /**
   * {{{template_notificacao_response_assunto_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_assunto_value}}}")
  public String getAssunto() {
    return assunto;
  }
  public void setAssunto(String assunto) {
    this.assunto = assunto;
  }

  
  /**
   * {{{template_notificacao_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{template_notificacao_response_data_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{template_notificacao_response_data_alteracao_value}}}")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateNotificacaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConfiguracaoEmail: ").append(idConfiguracaoEmail).append("\n");
    sb.append("  tipoLayout: ").append(tipoLayout).append("\n");
    sb.append("  tipoNotificacao: ").append(tipoNotificacao).append("\n");
    sb.append("  templatePadrao: ").append(templatePadrao).append("\n");
    sb.append("  remetente: ").append(remetente).append("\n");
    sb.append("  assunto: ").append(assunto).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



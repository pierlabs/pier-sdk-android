package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of details of the Notification Template
 **/
@ApiModel(description = "Object of details of the Notification Template")
public class TemplateNotificacaoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConfiguracaoEmail")
  private Long idConfiguracaoEmail = null;
  public enum TipoLayoutEnum {
     RECUPERAR_SENHA,  FATURA_POR_EMAIL,  VALIDAR_DISPOSITIVO,  NOTIFICACAO_EMAIL,  OTP_3D_SECURE, 
  };
  @SerializedName("tipoLayout")
  private TipoLayoutEnum tipoLayout = null;
  public enum TipoNotificacaoEnum {
     SMS,  PUSH_APNS,  PUSH_FCM,  PUSH_GCM,  WEBHOOK,  EMAIL, 
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
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * Identifier Code
   **/
  @ApiModelProperty(value = "Identifier Code")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the E-mail Configuration
   **/
  @ApiModelProperty(value = "Identification Code of the E-mail Configuration")
  public Long getIdConfiguracaoEmail() {
    return idConfiguracaoEmail;
  }
  public void setIdConfiguracaoEmail(Long idConfiguracaoEmail) {
    this.idConfiguracaoEmail = idConfiguracaoEmail;
  }

  
  /**
   * Layout type of the e-mail
   **/
  @ApiModelProperty(value = "Layout type of the e-mail")
  public TipoLayoutEnum getTipoLayout() {
    return tipoLayout;
  }
  public void setTipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
  }

  
  /**
   * Notification type
   **/
  @ApiModelProperty(value = "Notification type")
  public TipoNotificacaoEnum getTipoNotificacao() {
    return tipoNotificacao;
  }
  public void setTipoNotificacao(TipoNotificacaoEnum tipoNotificacao) {
    this.tipoNotificacao = tipoNotificacao;
  }

  
  /**
   * Standard Template
   **/
  @ApiModelProperty(value = "Standard Template")
  public String getTemplatePadrao() {
    return templatePadrao;
  }
  public void setTemplatePadrao(String templatePadrao) {
    this.templatePadrao = templatePadrao;
  }

  
  /**
   * Sender
   **/
  @ApiModelProperty(value = "Sender")
  public String getRemetente() {
    return remetente;
  }
  public void setRemetente(String remetente) {
    this.remetente = remetente;
  }

  
  /**
   * Email subject
   **/
  @ApiModelProperty(value = "Email subject")
  public String getAssunto() {
    return assunto;
  }
  public void setAssunto(String assunto) {
    this.assunto = assunto;
  }

  
  /**
   * Inclusion date
   **/
  @ApiModelProperty(value = "Inclusion date")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Update date
   **/
  @ApiModelProperty(value = "Update date")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * E-mail content
   **/
  @ApiModelProperty(value = "E-mail content")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateNotificacaoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConfiguracaoEmail: ").append(idConfiguracaoEmail).append("\n");
    sb.append("  tipoLayout: ").append(tipoLayout).append("\n");
    sb.append("  tipoNotificacao: ").append(tipoNotificacao).append("\n");
    sb.append("  templatePadrao: ").append(templatePadrao).append("\n");
    sb.append("  remetente: ").append(remetente).append("\n");
    sb.append("  assunto: ").append(assunto).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

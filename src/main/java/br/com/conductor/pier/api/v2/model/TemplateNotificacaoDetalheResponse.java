package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de detalhes do Template de Notifica\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto de detalhes do Template de Notifica\u00E7\u00E3o")
public class TemplateNotificacaoDetalheResponse  {
  
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
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * C\u00F3digo Identificador.
   **/
  @ApiModelProperty(value = "C\u00F3digo Identificador.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de e-mail.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de e-mail.")
  public Long getIdConfiguracaoEmail() {
    return idConfiguracaoEmail;
  }
  public void setIdConfiguracaoEmail(Long idConfiguracaoEmail) {
    this.idConfiguracaoEmail = idConfiguracaoEmail;
  }

  
  /**
   * Tipo do layout de e-mail.
   **/
  @ApiModelProperty(value = "Tipo do layout de e-mail.")
  public TipoLayoutEnum getTipoLayout() {
    return tipoLayout;
  }
  public void setTipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
  }

  
  /**
   * Tipo da notifica\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "Tipo da notifica\u00E7\u00E3o.")
  public TipoNotificacaoEnum getTipoNotificacao() {
    return tipoNotificacao;
  }
  public void setTipoNotificacao(TipoNotificacaoEnum tipoNotificacao) {
    this.tipoNotificacao = tipoNotificacao;
  }

  
  /**
   * Template padr\u00E3o.
   **/
  @ApiModelProperty(value = "Template padr\u00E3o.")
  public String getTemplatePadrao() {
    return templatePadrao;
  }
  public void setTemplatePadrao(String templatePadrao) {
    this.templatePadrao = templatePadrao;
  }

  
  /**
   * Remetente.
   **/
  @ApiModelProperty(value = "Remetente.")
  public String getRemetente() {
    return remetente;
  }
  public void setRemetente(String remetente) {
    this.remetente = remetente;
  }

  
  /**
   * Assunto do e-mail.
   **/
  @ApiModelProperty(value = "Assunto do e-mail.")
  public String getAssunto() {
    return assunto;
  }
  public void setAssunto(String assunto) {
    this.assunto = assunto;
  }

  
  /**
   * Data da inclus\u00E3o.
   **/
  @ApiModelProperty(value = "Data da inclus\u00E3o.")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data altera\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "Data altera\u00E7\u00E3o.")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * Conteudo do e-mail.
   **/
  @ApiModelProperty(value = "Conteudo do e-mail.")
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

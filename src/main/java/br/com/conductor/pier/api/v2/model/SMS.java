package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto SMS
 **/
@ApiModel(description = "Objeto SMS")
public class SMS  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nsu")
  private Long nsu = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  OUTROS, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  public enum StatusEnum {
     PENDENTE,  ENCAMINHADO,  ENVIADO,  RESPONDIDO,  ERRO,  ERRO_RESPOSTA,  SUCESSO_RESPOSTA, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("celular")
  private String celular = null;
  @SerializedName("operadora")
  private String operadora = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("resposta")
  private String resposta = null;
  @SerializedName("dataAgendamento")
  private Date dataAgendamento = null;
  @SerializedName("quantidadeTentativasEnvio")
  private Integer quantidadeTentativasEnvio = null;
  @SerializedName("dataInclusao")
  private Date dataInclusao = null;
  @SerializedName("dataAlteracaoStatus")
  private Date dataAlteracaoStatus = null;
  @SerializedName("protocolo")
  private String protocolo = null;

  
  /**
   * C\u00C3\u00B3digo Identificador.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo Identificador.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00C3\u00BAmero sequencial \u00C3\u00BAnico.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero sequencial \u00C3\u00BAnico.")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do emissor (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do emissor (id).")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * TipoEvento de notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "TipoEvento de notifica\u00C3\u00A7\u00C3\u00A3o")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o do status de envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * C\u00C3\u00B3digo identificado da pessoa
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificado da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999
   **/
  @ApiModelProperty(required = true, value = "Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * Apresenta a operadora do celular a ser eviado o SMS
   **/
  @ApiModelProperty(required = true, value = "Apresenta a operadora do celular a ser eviado o SMS")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * Apresenta o texto da notifica\u00C3\u00A7\u00C3\u00A3o a ser enviado
   **/
  @ApiModelProperty(required = true, value = "Apresenta o texto da notifica\u00C3\u00A7\u00C3\u00A3o a ser enviado")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta o texto da resposta da notifica\u00C3\u00A7\u00C3\u00A3o que foi enviada
   **/
  @ApiModelProperty(required = true, value = "Apresenta o texto da resposta da notifica\u00C3\u00A7\u00C3\u00A3o que foi enviada")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * Apresenta a data e hora em que ser\u00C3\u00A1 enviado a notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data e hora em que ser\u00C3\u00A1 enviado a notifica\u00C3\u00A7\u00C3\u00A3o")
  public Date getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(Date dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Quantidade de tentativas e envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Quantidade de tentativas e envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * Apresenta a data e em que o registro foi inclu\u00C3\u00ADdo na base para ser enviado
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data e em que o registro foi inclu\u00C3\u00ADdo na base para ser enviado")
  public Date getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(Date dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Apresenta a data e em que o Stattjus do registro foi modificado
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data e em que o Stattjus do registro foi modificado")
  public Date getDataAlteracaoStatus() {
    return dataAlteracaoStatus;
  }
  public void setDataAlteracaoStatus(Date dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
  }

  
  /**
   * N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMS {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nsu: ").append(nsu).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  celular: ").append(celular).append("\n");
    sb.append("  operadora: ").append(operadora).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  resposta: ").append(resposta).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  quantidadeTentativasEnvio: ").append(quantidadeTentativasEnvio).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracaoStatus: ").append(dataAlteracaoStatus).append("\n");
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto AtendimentoCliente
 **/
@ApiModel(description = "Objeto AtendimentoCliente")
public class AtendimentoClienteResponse  {
  
  @SerializedName("idAtendimento")
  private Long idAtendimento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoAtendimento")
  private Long idTipoAtendimento = null;
  @SerializedName("descricaoTipoAtendimento")
  private String descricaoTipoAtendimento = null;
  @SerializedName("conteudoAtendimento")
  private String conteudoAtendimento = null;
  @SerializedName("detalhesAtendimento")
  private String detalhesAtendimento = null;
  @SerializedName("nomeAtendente")
  private String nomeAtendente = null;
  @SerializedName("nomeSistema")
  private String nomeSistema = null;
  @SerializedName("dataHoraInicioAtendimento")
  private String dataHoraInicioAtendimento = null;
  @SerializedName("dataHoraFimAtendimento")
  private String dataHoraFimAtendimento = null;
  @SerializedName("dataAtendimento")
  private String dataAtendimento = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  @SerializedName("dataProcessamento")
  private String dataProcessamento = null;
  @SerializedName("flagProcessamento")
  private Integer flagProcessamento = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Atendimento (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Atendimento (id)")
  public Long getIdAtendimento() {
    return idAtendimento;
  }
  public void setIdAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o Atendimento est\u00C3\u00A1 associado
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o Atendimento est\u00C3\u00A1 associado")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento (id)")
  public Long getIdTipoAtendimento() {
    return idTipoAtendimento;
  }
  public void setIdTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
  }

  
  /**
   * Apresenta a descri\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento
   **/
  @ApiModelProperty(value = "Apresenta a descri\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento")
  public String getDescricaoTipoAtendimento() {
    return descricaoTipoAtendimento;
  }
  public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
  }

  
  /**
   * Apresenta as informa\u00C3\u00A7\u00C3\u00B5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00C3\u00A7\u00C3\u00B5es relacionadas ao Atendimento.
   **/
  @ApiModelProperty(value = "Apresenta as informa\u00C3\u00A7\u00C3\u00B5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00C3\u00A7\u00C3\u00B5es relacionadas ao Atendimento.")
  public String getConteudoAtendimento() {
    return conteudoAtendimento;
  }
  public void setConteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
  }

  
  /**
   * Apresenta os detalhes lan\u00C3\u00A7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.
   **/
  @ApiModelProperty(value = "Apresenta os detalhes lan\u00C3\u00A7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.")
  public String getDetalhesAtendimento() {
    return detalhesAtendimento;
  }
  public void setDetalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
  }

  
  /**
   * Apresenta o nome do Atendente que registrou o Atendimento.
   **/
  @ApiModelProperty(value = "Apresenta o nome do Atendente que registrou o Atendimento.")
  public String getNomeAtendente() {
    return nomeAtendente;
  }
  public void setNomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
  }

  
  /**
   * Apresenta o nome do Sistema, Servidor, M\u00C3\u00B3dulo ou M\u00C3\u00A9todo REST que originou o registro do Atendimento.
   **/
  @ApiModelProperty(value = "Apresenta o nome do Sistema, Servidor, M\u00C3\u00B3dulo ou M\u00C3\u00A9todo REST que originou o registro do Atendimento.")
  public String getNomeSistema() {
    return nomeSistema;
  }
  public void setNomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.
   **/
  @ApiModelProperty(value = "Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.")
  public String getDataHoraInicioAtendimento() {
    return dataHoraInicioAtendimento;
  }
  public void setDataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.
   **/
  @ApiModelProperty(value = "Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos.")
  public String getDataHoraFimAtendimento() {
    return dataHoraFimAtendimento;
  }
  public void setDataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
  }

  
  /**
   * Apresenta a data e hora em que o Atendimento foi realizado.
   **/
  @ApiModelProperty(value = "Apresenta a data e hora em que o Atendimento foi realizado.")
  public String getDataAtendimento() {
    return dataAtendimento;
  }
  public void setDataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
  }

  
  /**
   * Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data e hora para processamento ou a data para retorno do Atendimento.
   **/
  @ApiModelProperty(value = "Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data e hora para processamento ou a data para retorno do Atendimento.")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Quando utilizado, apresenta a data e hora em que a solicita\u00C3\u00A7\u00C3\u00A3o registrada no Atendimento fora processada.
   **/
  @ApiModelProperty(value = "Quando utilizado, apresenta a data e hora em que a solicita\u00C3\u00A7\u00C3\u00A3o registrada no Atendimento fora processada.")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * Quando aplic\u00C3\u00A1vel, de acordo com o Indica se o Processamento da solicita\u00C3\u00A7\u00C3\u00A3o fora realizado.
   **/
  @ApiModelProperty(value = "Quando aplic\u00C3\u00A1vel, de acordo com o Indica se o Processamento da solicita\u00C3\u00A7\u00C3\u00A3o fora realizado.")
  public Integer getFlagProcessamento() {
    return flagProcessamento;
  }
  public void setFlagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtendimentoClienteResponse {\n");
    
    sb.append("  idAtendimento: ").append(idAtendimento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoAtendimento: ").append(idTipoAtendimento).append("\n");
    sb.append("  descricaoTipoAtendimento: ").append(descricaoTipoAtendimento).append("\n");
    sb.append("  conteudoAtendimento: ").append(conteudoAtendimento).append("\n");
    sb.append("  detalhesAtendimento: ").append(detalhesAtendimento).append("\n");
    sb.append("  nomeAtendente: ").append(nomeAtendente).append("\n");
    sb.append("  nomeSistema: ").append(nomeSistema).append("\n");
    sb.append("  dataHoraInicioAtendimento: ").append(dataHoraInicioAtendimento).append("\n");
    sb.append("  dataHoraFimAtendimento: ").append(dataHoraFimAtendimento).append("\n");
    sb.append("  dataAtendimento: ").append(dataAtendimento).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  flagProcessamento: ").append(flagProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

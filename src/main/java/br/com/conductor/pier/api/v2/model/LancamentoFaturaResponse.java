package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Fatura futura
 **/
@ApiModel(description = "Fatura futura")
public class LancamentoFaturaResponse  {
  
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("descricaoTipoTransacao")
  private String descricaoTipoTransacao = null;
  @SerializedName("idTipoEvento")
  private Long idTipoEvento = null;
  @SerializedName("descricaoTipoEvento")
  private String descricaoTipoEvento = null;
  @SerializedName("idEvento")
  private Long idEvento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("dataHoraTransacao")
  private String dataHoraTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("descricaoEstabelecimento")
  private String descricaoEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("flagCredito")
  private Boolean flagCredito = null;
  @SerializedName("idMCC")
  private Long idMCC = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("numeroCartaoMascarado")
  private String numeroCartaoMascarado = null;
  @SerializedName("flagSolicitouContestacao")
  private Boolean flagSolicitouContestacao = null;
  @SerializedName("valorTaxaEmbarque")
  private BigDecimal valorTaxaEmbarque = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo da transa\u00C3\u00A7\u00C3\u00A3o")
  public String getDescricaoTipoTransacao() {
    return descricaoTipoTransacao;
  }
  public void setDescricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do evento
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do tipo do evento")
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo do evento
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo do evento")
  public String getDescricaoTipoEvento() {
    return descricaoTipoEvento;
  }
  public void setDescricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do evento
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do evento")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o complementar do evento
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o complementar do evento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Valor em reais
   **/
  @ApiModelProperty(value = "Valor em reais")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor em dolar
   **/
  @ApiModelProperty(value = "Valor em dolar")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * N\u00C3\u00BAmero da parcela
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da parcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Quantidade de parcelas
   **/
  @ApiModelProperty(value = "Quantidade de parcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Data da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Data da transa\u00C3\u00A7\u00C3\u00A3o")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Nome do estabelecimento
   **/
  @ApiModelProperty(value = "Nome do estabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Nome fantasia do estabelecimento
   **/
  @ApiModelProperty(value = "Nome fantasia do estabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Flag que indica se o lan\u00C3\u00A7amento \u00C3\u00A9 de cr\u00C3\u00A9dito
   **/
  @ApiModelProperty(value = "Flag que indica se o lan\u00C3\u00A7amento \u00C3\u00A9 de cr\u00C3\u00A9dito")
  public Boolean getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do MCC (Merchant Category Codes)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do MCC (Merchant Category Codes)")
  public Long getIdMCC() {
    return idMCC;
  }
  public void setIdMCC(Long idMCC) {
    this.idMCC = idMCC;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do grupo MCC
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do grupo MCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do grupo MCC
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do grupo MCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Indica se o portador do cart\u00C3\u00A3o \u00C3\u00A9 o titular da conta
   **/
  @ApiModelProperty(value = "Indica se o portador do cart\u00C3\u00A3o \u00C3\u00A9 o titular da conta")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Nome impresso no cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Nome impresso no cart\u00C3\u00A3o")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o mascarado
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o mascarado")
  public String getNumeroCartaoMascarado() {
    return numeroCartaoMascarado;
  }
  public void setNumeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
  }

  
  /**
   * Flag que indica se o cliente solicitou contesta\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Flag que indica se o cliente solicitou contesta\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o")
  public Boolean getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Boolean flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * Valor da taxa de embarque
   **/
  @ApiModelProperty(value = "Valor da taxa de embarque")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LancamentoFaturaResponse {\n");
    
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  descricaoTipoTransacao: ").append(descricaoTipoTransacao).append("\n");
    sb.append("  idTipoEvento: ").append(idTipoEvento).append("\n");
    sb.append("  descricaoTipoEvento: ").append(descricaoTipoEvento).append("\n");
    sb.append("  idEvento: ").append(idEvento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  dataHoraTransacao: ").append(dataHoraTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  descricaoEstabelecimento: ").append(descricaoEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  idMCC: ").append(idMCC).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  numeroCartaoMascarado: ").append(numeroCartaoMascarado).append("\n");
    sb.append("  flagSolicitouContestacao: ").append(flagSolicitouContestacao).append("\n");
    sb.append("  valorTaxaEmbarque: ").append(valorTaxaEmbarque).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



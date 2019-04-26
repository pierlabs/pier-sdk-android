package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto extrato da conta digital
 **/
@ApiModel(description = "Objeto extrato da conta digital")
public class ExtratoResponse  {
  
  @SerializedName("agenciaBeneficiario")
  private String agenciaBeneficiario = null;
  @SerializedName("agenciaPagador")
  private String agenciaPagador = null;
  @SerializedName("bancoBeneficiario")
  private String bancoBeneficiario = null;
  @SerializedName("bancoPagador")
  private String bancoPagador = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("contaBeneficiario")
  private String contaBeneficiario = null;
  @SerializedName("contaPagador")
  private String contaPagador = null;
  @SerializedName("credito")
  private Boolean credito = null;
  @SerializedName("dataHoraTransacao")
  private String dataHoraTransacao = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;
  @SerializedName("descricaoEstabelecimento")
  private String descricaoEstabelecimento = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("descricaoTipoEvento")
  private String descricaoTipoEvento = null;
  @SerializedName("descricaoTipoTransacao")
  private String descricaoTipoTransacao = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEvento")
  private Long idEvento = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("idMCC")
  private Long idMCC = null;
  @SerializedName("idPessoaFisica")
  private Long idPessoaFisica = null;
  @SerializedName("idTipoEvento")
  private Long idTipoEvento = null;
  @SerializedName("idTipoTransacao")
  private Long idTipoTransacao = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("nomeBeneficiario")
  private String nomeBeneficiario = null;
  @SerializedName("nomeConcessionaria")
  private String nomeConcessionaria = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("nomeEstabelecimentoVisa")
  private String nomeEstabelecimentoVisa = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("nomePagador")
  private String nomePagador = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("numeroCartaoMascarado")
  private String numeroCartaoMascarado = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("solicitouContestacao")
  private Boolean solicitouContestacao = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("transferenciaBancoAgenciaConta")
  private String transferenciaBancoAgenciaConta = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorTaxaEmbarque")
  private BigDecimal valorTaxaEmbarque = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;

  
  /**
   * Ag\u00EAncia do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1rias 
   **/
  @ApiModelProperty(value = "Ag\u00EAncia do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1rias ")
  public String getAgenciaBeneficiario() {
    return agenciaBeneficiario;
  }
  public void setAgenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
  }

  
  /**
   * Ag\u00EAncia pagador referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Ag\u00EAncia pagador referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getAgenciaPagador() {
    return agenciaPagador;
  }
  public void setAgenciaPagador(String agenciaPagador) {
    this.agenciaPagador = agenciaPagador;
  }

  
  /**
   * Banco do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Banco do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getBancoBeneficiario() {
    return bancoBeneficiario;
  }
  public void setBancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
  }

  
  /**
   * Banco pagador referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Banco pagador referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getBancoPagador() {
    return bancoPagador;
  }
  public void setBancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
  }

  
  /**
   * Complemento
   **/
  @ApiModelProperty(value = "Complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Conta do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Conta do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getContaBeneficiario() {
    return contaBeneficiario;
  }
  public void setContaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
  }

  
  /**
   * Conta pagadora referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Conta pagadora referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getContaPagador() {
    return contaPagador;
  }
  public void setContaPagador(String contaPagador) {
    this.contaPagador = contaPagador;
  }

  
  /**
   * \u00D3p\u00E7\u00E3o cr\u00E9dito
   **/
  @ApiModelProperty(value = "\u00D3p\u00E7\u00E3o cr\u00E9dito")
  public Boolean getCredito() {
    return credito;
  }
  public void setCredito(Boolean credito) {
    this.credito = credito;
  }

  
  /**
   * Data e hora da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data e hora da transa\u00E7\u00E3o")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Breve descri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Breve descri\u00E7\u00E3o")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Descri\u00E7\u00E3o do estabelecimento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do estabelecimento")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo MCC
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do grupo MCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo do evento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo do evento")
  public String getDescricaoTipoEvento() {
    return descricaoTipoEvento;
  }
  public void setDescricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo da transa\u00E7\u00E3o")
  public String getDescricaoTipoTransacao() {
    return descricaoTipoTransacao;
  }
  public void setDescricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador do evento
   **/
  @ApiModelProperty(value = "Identificador do evento")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * Identificador do grupo MCC
   **/
  @ApiModelProperty(value = "Identificador do grupo MCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Identificador do MCC
   **/
  @ApiModelProperty(value = "Identificador do MCC")
  public Long getIdMCC() {
    return idMCC;
  }
  public void setIdMCC(Long idMCC) {
    this.idMCC = idMCC;
  }

  
  /**
   * Identificador da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "Identificador da pessoa f\u00EDsica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Identificador do tipo do evento
   **/
  @ApiModelProperty(value = "Identificador do tipo do evento")
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  
  /**
   * Identificador do tipo da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do tipo da transa\u00E7\u00E3o")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Identificador da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador da transa\u00E7\u00E3o")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Nome do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Nome do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Nome da concession\u00E1ria do boleto pago
   **/
  @ApiModelProperty(value = "Nome da concession\u00E1ria do boleto pago")
  public String getNomeConcessionaria() {
    return nomeConcessionaria;
  }
  public void setNomeConcessionaria(String nomeConcessionaria) {
    this.nomeConcessionaria = nomeConcessionaria;
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
   * Nome do estabelecimento visa
   **/
  @ApiModelProperty(value = "Nome do estabelecimento visa")
  public String getNomeEstabelecimentoVisa() {
    return nomeEstabelecimentoVisa;
  }
  public void setNomeEstabelecimentoVisa(String nomeEstabelecimentoVisa) {
    this.nomeEstabelecimentoVisa = nomeEstabelecimentoVisa;
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
   * Nome do pagador referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Nome do pagador referente a opera\u00E7\u00E3o banc\u00E1ria")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * Nome do portador
   **/
  @ApiModelProperty(value = "Nome do portador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o mascarado
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o mascarado")
  public String getNumeroCartaoMascarado() {
    return numeroCartaoMascarado;
  }
  public void setNumeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas")
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
   * Op\u00E7\u00E3o de solicitar contesta\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Op\u00E7\u00E3o de solicitar contesta\u00E7\u00E3o")
  public Boolean getSolicitouContestacao() {
    return solicitouContestacao;
  }
  public void setSolicitouContestacao(Boolean solicitouContestacao) {
    this.solicitouContestacao = solicitouContestacao;
  }

  
  /**
   * Titular
   **/
  @ApiModelProperty(value = "Titular")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Transf\u00EArencia para banco agencia e conta
   **/
  @ApiModelProperty(value = "Transf\u00EArencia para banco agencia e conta")
  public String getTransferenciaBancoAgenciaConta() {
    return transferenciaBancoAgenciaConta;
  }
  public void setTransferenciaBancoAgenciaConta(String transferenciaBancoAgenciaConta) {
    this.transferenciaBancoAgenciaConta = transferenciaBancoAgenciaConta;
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
   * Valor sobre taxa de embarca
   **/
  @ApiModelProperty(value = "Valor sobre taxa de embarca")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Valor em d\u00F3lares
   **/
  @ApiModelProperty(value = "Valor em d\u00F3lares")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResponse {\n");
    
    sb.append("  agenciaBeneficiario: ").append(agenciaBeneficiario).append("\n");
    sb.append("  agenciaPagador: ").append(agenciaPagador).append("\n");
    sb.append("  bancoBeneficiario: ").append(bancoBeneficiario).append("\n");
    sb.append("  bancoPagador: ").append(bancoPagador).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  contaBeneficiario: ").append(contaBeneficiario).append("\n");
    sb.append("  contaPagador: ").append(contaPagador).append("\n");
    sb.append("  credito: ").append(credito).append("\n");
    sb.append("  dataHoraTransacao: ").append(dataHoraTransacao).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("  descricaoEstabelecimento: ").append(descricaoEstabelecimento).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  descricaoTipoEvento: ").append(descricaoTipoEvento).append("\n");
    sb.append("  descricaoTipoTransacao: ").append(descricaoTipoTransacao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEvento: ").append(idEvento).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  idMCC: ").append(idMCC).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("  idTipoEvento: ").append(idTipoEvento).append("\n");
    sb.append("  idTipoTransacao: ").append(idTipoTransacao).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  nomeBeneficiario: ").append(nomeBeneficiario).append("\n");
    sb.append("  nomeConcessionaria: ").append(nomeConcessionaria).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  nomeEstabelecimentoVisa: ").append(nomeEstabelecimentoVisa).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  nomePagador: ").append(nomePagador).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  numeroCartaoMascarado: ").append(numeroCartaoMascarado).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  solicitouContestacao: ").append(solicitouContestacao).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  transferenciaBancoAgenciaConta: ").append(transferenciaBancoAgenciaConta).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorTaxaEmbarque: ").append(valorTaxaEmbarque).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

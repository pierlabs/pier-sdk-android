package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object account
 **/
@ApiModel(description = "Object account")
public class ContaDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("idFantasiaBasica")
  private Long idFantasiaBasica = null;
  @SerializedName("nomeFantasiaBasica")
  private String nomeFantasiaBasica = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("statusConta")
  private String statusConta = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("melhorDiaCompra")
  private Integer melhorDiaCompra = null;
  @SerializedName("dataStatusConta")
  private String dataStatusConta = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataUltimaAlteracaoVencimento")
  private String dataUltimaAlteracaoVencimento = null;
  @SerializedName("dataHoraUltimaCompra")
  private String dataHoraUltimaCompra = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("formaEnvioFatura")
  private String formaEnvioFatura = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteSaqueGlobal")
  private BigDecimal limiteSaqueGlobal = null;
  @SerializedName("saldoDisponivelGlobal")
  private BigDecimal saldoDisponivelGlobal = null;
  @SerializedName("saldoDisponivelSaque")
  private BigDecimal saldoDisponivelSaque = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("diasAtraso")
  private Long diasAtraso = null;
  @SerializedName("proximoVencimentoPadrao")
  private String proximoVencimentoPadrao = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("quantidadePagamentos")
  private Integer quantidadePagamentos = null;
  @SerializedName("correspondencia")
  private Long correspondencia = null;
  @SerializedName("dataInicioAtraso")
  private String dataInicioAtraso = null;
  @SerializedName("rotativoPagaJuros")
  private BigDecimal rotativoPagaJuros = null;
  @SerializedName("totalPosProx")
  private BigDecimal totalPosProx = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("saldoExtratoAnterior")
  private BigDecimal saldoExtratoAnterior = null;
  @SerializedName("aceitaNovaContaPorGrupoProduto")
  private Boolean aceitaNovaContaPorGrupoProduto = null;
  public enum FuncaoAtivaEnum {
     DEBITO_CREDITO,  CREDITO, 
  };
  @SerializedName("funcaoAtiva")
  private FuncaoAtivaEnum funcaoAtiva = null;

  
  /**
   * Identification Code of the account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the account (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Cardholder (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Cardholder (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Show the 'Full Name of the PP' ot the 'Full Name of the Social Reason (Business Name)'
   **/
  @ApiModelProperty(value = "Show the 'Full Name of the PP' ot the 'Full Name of the Social Reason (Business Name)'")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identification Code of the product which the account takes part (id)
   **/
  @ApiModelProperty(value = "Identification Code of the product which the account takes part (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the Commercial Origin (id) that created the Account
   **/
  @ApiModelProperty(value = "Identification Code of the Commercial Origin (id) that created the Account")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Name of the Commercial Origin
   **/
  @ApiModelProperty(value = "Name of the Commercial Origin")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Identification Code of the Basic Fantasy (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Basic Fantasy (id)")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Name of the Basic Fantasy
   **/
  @ApiModelProperty(value = "Name of the Basic Fantasy")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * Identification Code of the status attributed to the account
   **/
  @ApiModelProperty(value = "Identification Code of the status attributed to the account")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Description of status of the account
   **/
  @ApiModelProperty(value = "Description of status of the account")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Show the expiration day
   **/
  @ApiModelProperty(value = "Show the expiration day")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Show the best date of shopping
   **/
  @ApiModelProperty(value = "Show the best date of shopping")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Show the date which the current idStatusAccount was attributed for it
   **/
  @ApiModelProperty(value = "Show the date which the current idStatusAccount was attributed for it")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Show the date which the card was created
   **/
  @ApiModelProperty(value = "Show the date which the card was created")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Show the date of the last update of expiration
   **/
  @ApiModelProperty(value = "Show the date of the last update of expiration")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * Show the date of the last update of expiration
   **/
  @ApiModelProperty(value = "Show the date of the last update of expiration")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * Number of the agency
   **/
  @ApiModelProperty(value = "Number of the agency")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Current Account Number
   **/
  @ApiModelProperty(value = "Current Account Number")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Value of the proven income
   **/
  @ApiModelProperty(value = "Value of the proven income")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Sending way of the invoice
   **/
  @ApiModelProperty(value = "Sending way of the invoice")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * Show if the person is the Cardholder
   **/
  @ApiModelProperty(value = "Show if the person is the Cardholder")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Show the value of credit limit that the cardholder has
   **/
  @ApiModelProperty(value = "Show the value of credit limit that the cardholder has")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * when it is used by the issuer, this field shows the value of the credit limit that the cardholder can use to make National Withdrawal transactions
   **/
  @ApiModelProperty(value = "when it is used by the issuer, this field shows the value of the credit limit that the cardholder can use to make National Withdrawal transactions")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * When it is used by the issuer, this field show the value of credit limit that the cardholder has to the exclusively use in National Shopping
   **/
  @ApiModelProperty(value = "When it is used by the issuer, this field show the value of credit limit that the cardholder has to the exclusively use in National Shopping")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * When it is used by the issuer, this field show the value of the credit limit that the cardholder can used to make National Withdrawal Transactions inside of each cycle of billing
   **/
  @ApiModelProperty(value = "When it is used by the issuer, this field show the value of the credit limit that the cardholder can used to make National Withdrawal Transactions inside of each cycle of billing")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   **/
  @ApiModelProperty(value = "Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) ")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Show the quantity of days that the account is in arrears
   **/
  @ApiModelProperty(value = "Show the quantity of days that the account is in arrears")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * Next Expering Date Default
   **/
  @ApiModelProperty(value = "Next Expering Date Default")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   * Proposal identifier
   **/
  @ApiModelProperty(value = "Proposal identifier")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Number of payments
   **/
  @ApiModelProperty(value = "Number of payments")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   * correspondence
   **/
  @ApiModelProperty(value = "correspondence")
  public Long getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Expiry date of Collection
   **/
  @ApiModelProperty(value = "Expiry date of Collection")
  public String getDataInicioAtraso() {
    return dataInicioAtraso;
  }
  public void setDataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
  }

  
  /**
   * Revolving interest rate
   **/
  @ApiModelProperty(value = "Revolving interest rate")
  public BigDecimal getRotativoPagaJuros() {
    return rotativoPagaJuros;
  }
  public void setRotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
  }

  
  /**
   * Next Invoice Value
   **/
  @ApiModelProperty(value = "Next Invoice Value")
  public BigDecimal getTotalPosProx() {
    return totalPosProx;
  }
  public void setTotalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
  }

  
  /**
   * Final Actual Value
   **/
  @ApiModelProperty(value = "Final Actual Value")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Previous account balance
   **/
  @ApiModelProperty(value = "Previous account balance")
  public BigDecimal getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   * Flag indicating acceptance of new account opening by product group
   **/
  @ApiModelProperty(value = "Flag indicating acceptance of new account opening by product group")
  public Boolean getAceitaNovaContaPorGrupoProduto() {
    return aceitaNovaContaPorGrupoProduto;
  }
  public void setAceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
  }

  
  /**
   * Active account function
   **/
  @ApiModelProperty(value = "Active account function")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  nomeFantasiaBasica: ").append(nomeFantasiaBasica).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  melhorDiaCompra: ").append(melhorDiaCompra).append("\n");
    sb.append("  dataStatusConta: ").append(dataStatusConta).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataUltimaAlteracaoVencimento: ").append(dataUltimaAlteracaoVencimento).append("\n");
    sb.append("  dataHoraUltimaCompra: ").append(dataHoraUltimaCompra).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  formaEnvioFatura: ").append(formaEnvioFatura).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("  proximoVencimentoPadrao: ").append(proximoVencimentoPadrao).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  quantidadePagamentos: ").append(quantidadePagamentos).append("\n");
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("  dataInicioAtraso: ").append(dataInicioAtraso).append("\n");
    sb.append("  rotativoPagaJuros: ").append(rotativoPagaJuros).append("\n");
    sb.append("  totalPosProx: ").append(totalPosProx).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  saldoExtratoAnterior: ").append(saldoExtratoAnterior).append("\n");
    sb.append("  aceitaNovaContaPorGrupoProduto: ").append(aceitaNovaContaPorGrupoProduto).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto conta
 **/
@ApiModel(description = "Objeto conta")
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
  private Date dataStatusConta = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("dataCadastro")
  private Date dataCadastro = null;
  @SerializedName("dataUltimaAlteracaoVencimento")
  private Date dataUltimaAlteracaoVencimento = null;
  @SerializedName("dataHoraUltimaCompra")
  private Date dataHoraUltimaCompra = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
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
  @SerializedName("diasAtraso")
  private Long diasAtraso = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Nome da origem comercial
   **/
  @ApiModelProperty(required = true, value = "Nome da origem comercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia Basica (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia Basica (id).")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Nome da Fantasia Basica
   **/
  @ApiModelProperty(required = true, value = "Nome da Fantasia Basica")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Apresenta o dia de vencimento.
   **/
  @ApiModelProperty(value = "Apresenta o dia de vencimento.")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Apresenta o melhor dia de compra.
   **/
  @ApiModelProperty(value = "Apresenta o melhor dia de compra.")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.")
  public Date getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(Date dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Valor da renda comprovada.
   **/
  @ApiModelProperty(value = "Valor da renda comprovada.")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o cart\u00C3\u00A3o foi gerado.")
  public Date getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.
   **/
  @ApiModelProperty(value = "Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.")
  public Date getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(Date dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.
   **/
  @ApiModelProperty(value = "Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.")
  public Date getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(Date dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia.")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta corrente.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da conta corrente.")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Forma de envio da fatura.
   **/
  @ApiModelProperty(value = "Forma de envio da fatura.")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * Apresenta se a pessoa \u00C3\u00A9 titular da conta.
   **/
  @ApiModelProperty(value = "Apresenta se a pessoa \u00C3\u00A9 titular da conta.")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Apresenta a quantidade de dias que a conta esta em atraso
   **/
  @ApiModelProperty(value = "Apresenta a quantidade de dias que a conta esta em atraso")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
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
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataUltimaAlteracaoVencimento: ").append(dataUltimaAlteracaoVencimento).append("\n");
    sb.append("  dataHoraUltimaCompra: ").append(dataHoraUltimaCompra).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  formaEnvioFatura: ").append(formaEnvioFatura).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ContaPersist
 **/
@ApiModel(description = "ContaPersist")
public class ContaPersist  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("idEnderecoCorrespondencia")
  private Long idEnderecoCorrespondencia = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("flagFaturaPorEmail")
  private Integer flagFaturaPorEmail = null;
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
  @SerializedName("matricula")
  private String matricula = null;
  @SerializedName("responsavelDigitacao")
  private String responsavelDigitacao = null;
  @SerializedName("idPromotorVenda")
  private Integer idPromotorVenda = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;

  
  /**
   * C\u00F3digo identificador da pessoa na base (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da pessoa na base (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial na base (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da origem comercial na base (id)")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto na base (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do produto na base (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Dia do vencimento da conta
   **/
  @ApiModelProperty(required = true, value = "Dia do vencimento da conta")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Valor da renda do titular da conta
   **/
  @ApiModelProperty(required = true, value = "Valor da renda do titular da conta")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Nome do canal por onde a conta foi cadastrada
   **/
  @ApiModelProperty(value = "Nome do canal por onde a conta foi cadastrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(required = true, value = "Valor da pontua\u00E7\u00E3o da conta")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * Limite global da conta
   **/
  @ApiModelProperty(required = true, value = "Limite global da conta")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Limite m\u00E1ximo da conta
   **/
  @ApiModelProperty(required = true, value = "Limite m\u00E1ximo da conta")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Limite de parcelas
   **/
  @ApiModelProperty(required = true, value = "Limite de parcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Limite consignado da conta
   **/
  @ApiModelProperty(required = true, value = "Limite consignado da conta")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Identifica a maneira que a fatura \u00E9 enviada
   **/
  @ApiModelProperty(required = true, value = "Identifica a maneira que a fatura \u00E9 enviada")
  public Integer getFlagFaturaPorEmail() {
    return flagFaturaPorEmail;
  }
  public void setFlagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
  }

  
  /**
   * Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas.  As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes
   **/
  @ApiModelProperty(value = "Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas.  As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Matr\u00EDcula da proposta
   **/
  @ApiModelProperty(value = "Matr\u00EDcula da proposta")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * Respons\u00E1vel pela digita\u00E7\u00E3o da proposta
   **/
  @ApiModelProperty(value = "Respons\u00E1vel pela digita\u00E7\u00E3o da proposta")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * C\u00F3digo identificador do promotor de venda
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do promotor de venda")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  
  /**
   * Status da conta
   **/
  @ApiModelProperty(value = "Status da conta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPersist {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  idEnderecoCorrespondencia: ").append(idEnderecoCorrespondencia).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  flagFaturaPorEmail: ").append(flagFaturaPorEmail).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  matricula: ").append(matricula).append("\n");
    sb.append("  responsavelDigitacao: ").append(responsavelDigitacao).append("\n");
    sb.append("  idPromotorVenda: ").append(idPromotorVenda).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

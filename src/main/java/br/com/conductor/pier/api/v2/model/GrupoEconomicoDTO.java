package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de requisi\u00E7\u00E3o para cadastrar grupo econ\u00F4mico
 **/
@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o para cadastrar grupo econ\u00F4mico")
public class GrupoEconomicoDTO  {
  
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeCredor")
  private String nomeCredor = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoContaCorrente")
  private String digitoContaCorrente = null;
  public enum PeriodicidadeEnum {
     NENHUM,  DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
  };
  @SerializedName("periodicidade")
  private PeriodicidadeEnum periodicidade = null;
  public enum PagamentoSemanalEnum {
     SEGUNDA,  TERCA,  QUARTA,  QUINTA,  SEXTA,  SABADO,  DOMINGO, 
  };
  @SerializedName("pagamentoSemanal")
  private PagamentoSemanalEnum pagamentoSemanal = null;
  @SerializedName("pagamentoMensal")
  private Integer pagamentoMensal = null;
  @SerializedName("pagamentoDecendialPrimeiro")
  private Integer pagamentoDecendialPrimeiro = null;
  @SerializedName("pagamentoDecendialSegundo")
  private Integer pagamentoDecendialSegundo = null;
  @SerializedName("pagamentoDecendialTerceiro")
  private Integer pagamentoDecendialTerceiro = null;
  @SerializedName("pagamentoQuinzenalPrimeiro")
  private Integer pagamentoQuinzenalPrimeiro = null;
  @SerializedName("pagamentoQuinzenalSegundo")
  private Integer pagamentoQuinzenalSegundo = null;
  @SerializedName("idCredorRAV")
  private Long idCredorRAV = null;
  @SerializedName("percentualRAV")
  private BigDecimal percentualRAV = null;
  public enum RecebeRAVEnum {
     NAO_TEM_PERMISSAO_RAV,  CREDITO_RAV,  DEBITO_RAV, 
  };
  @SerializedName("recebeRAV")
  private RecebeRAVEnum recebeRAV = null;
  @SerializedName("percentualMultiplica")
  private BigDecimal percentualMultiplica = null;
  @SerializedName("taxaAdm")
  private BigDecimal taxaAdm = null;
  @SerializedName("taxaBanco")
  private BigDecimal taxaBanco = null;
  @SerializedName("limiteRAV")
  private BigDecimal limiteRAV = null;

  
  /**
   * Raz\u00E3o social da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(required = true, value = "Raz\u00E3o social da pessoa jur\u00EDdica")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Nome do credor
   **/
  @ApiModelProperty(value = "Nome do credor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * N\u00FAmero da Receita Federal
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero da Receita Federal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * N\u00FAmero da inscri\u00E7\u00E3o estadual
   **/
  @ApiModelProperty(value = "N\u00FAmero da inscri\u00E7\u00E3o estadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Nome da pessoa para entrar em contato
   **/
  @ApiModelProperty(value = "Nome da pessoa para entrar em contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * C\u00F3digo do banco
   **/
  @ApiModelProperty(value = "C\u00F3digo do banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * C\u00F3digo da ag\u00EAncia
   **/
  @ApiModelProperty(value = "C\u00F3digo da ag\u00EAncia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00EDgito verificador da ag\u00EAncia
   **/
  @ApiModelProperty(value = "D\u00EDgito verificador da ag\u00EAncia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * C\u00F3digo da Conta Corrente
   **/
  @ApiModelProperty(value = "C\u00F3digo da Conta Corrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00EDgito Verificador da Conta Corrente
   **/
  @ApiModelProperty(value = "D\u00EDgito Verificador da Conta Corrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * Periodicidade do pagamento
   **/
  @ApiModelProperty(required = true, value = "Periodicidade do pagamento")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Dia para pagamento semanal
   **/
  @ApiModelProperty(value = "Dia para pagamento semanal")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * Dia da data para o pagamento mensal
   **/
  @ApiModelProperty(value = "Dia da data para o pagamento mensal")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * Dia da data para o primeiro pagamento decendial
   **/
  @ApiModelProperty(value = "Dia da data para o primeiro pagamento decendial")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * Dia da data para o segundo pagamento decendial
   **/
  @ApiModelProperty(value = "Dia da data para o segundo pagamento decendial")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * Dia da data para o terceiro pagamento decendial
   **/
  @ApiModelProperty(value = "Dia da data para o terceiro pagamento decendial")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * Dia da data para o primeiro pagamento quinzenal
   **/
  @ApiModelProperty(value = "Dia da data para o primeiro pagamento quinzenal")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Dia da data para o segundo pagamento quinzenal
   **/
  @ApiModelProperty(value = "Dia da data para o segundo pagamento quinzenal")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * Identificador do credor RAV
   **/
  @ApiModelProperty(required = true, value = "Identificador do credor RAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Valor percentual do RAV do credor
   **/
  @ApiModelProperty(required = true, value = "Valor percentual do RAV do credor")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Indica se o credor recebe RAV e o tipo
   **/
  @ApiModelProperty(value = "Indica se o credor recebe RAV e o tipo")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentual Multiplica
   **/
  @ApiModelProperty(value = "Percentual Multiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Taxa Administrativa
   **/
  @ApiModelProperty(value = "Taxa Administrativa")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * Taxa do Banco
   **/
  @ApiModelProperty(value = "Taxa do Banco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * Valor limite do RAV
   **/
  @ApiModelProperty(value = "Valor limite do RAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEconomicoDTO {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeCredor: ").append(nomeCredor).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  pagamentoSemanal: ").append(pagamentoSemanal).append("\n");
    sb.append("  pagamentoMensal: ").append(pagamentoMensal).append("\n");
    sb.append("  pagamentoDecendialPrimeiro: ").append(pagamentoDecendialPrimeiro).append("\n");
    sb.append("  pagamentoDecendialSegundo: ").append(pagamentoDecendialSegundo).append("\n");
    sb.append("  pagamentoDecendialTerceiro: ").append(pagamentoDecendialTerceiro).append("\n");
    sb.append("  pagamentoQuinzenalPrimeiro: ").append(pagamentoQuinzenalPrimeiro).append("\n");
    sb.append("  pagamentoQuinzenalSegundo: ").append(pagamentoQuinzenalSegundo).append("\n");
    sb.append("  idCredorRAV: ").append(idCredorRAV).append("\n");
    sb.append("  percentualRAV: ").append(percentualRAV).append("\n");
    sb.append("  recebeRAV: ").append(recebeRAV).append("\n");
    sb.append("  percentualMultiplica: ").append(percentualMultiplica).append("\n");
    sb.append("  taxaAdm: ").append(taxaAdm).append("\n");
    sb.append("  taxaBanco: ").append(taxaBanco).append("\n");
    sb.append("  limiteRAV: ").append(limiteRAV).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

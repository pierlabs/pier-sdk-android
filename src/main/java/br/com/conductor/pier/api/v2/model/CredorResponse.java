package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de credor
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de credor")
public class CredorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoaJuridica")
  private Long idPessoaJuridica = null;
  @SerializedName("nome")
  private String nome = null;
  public enum PeriodicidadeEnum {
     DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
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
  @SerializedName("credorBanco")
  private Boolean credorBanco = null;
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
  @SerializedName("idCredorRAV")
  private Long idCredorRAV = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoVerificadorAgencia")
  private String digitoVerificadorAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoVerificadorContaCorrente")
  private String digitoVerificadorContaCorrente = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * C\u00C3\u00B3digo identificador do credor
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do credor")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da pessoa jur\u00C3\u00ADdica do credor
   **/
  @ApiModelProperty(value = "Identificador da pessoa jur\u00C3\u00ADdica do credor")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * Nome do credor
   **/
  @ApiModelProperty(value = "Nome do credor")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Periodicidade do pagamento
   **/
  @ApiModelProperty(value = "Periodicidade do pagamento")
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
   * Indica se este credor pode ser um Credor RAV de outros credores
   **/
  @ApiModelProperty(value = "Indica se este credor pode ser um Credor RAV de outros credores")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * Valor percentual do RAV do credor
   **/
  @ApiModelProperty(value = "Valor percentual do RAV do credor")
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

  
  /**
   * C\u00C3\u00B3digo identificador do credor RAV
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do credor RAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   **/
  @ApiModelProperty(value = "Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia")
  public String getDigitoVerificadorAgencia() {
    return digitoVerificadorAgencia;
  }
  public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
    this.digitoVerificadorAgencia = digitoVerificadorAgencia;
  }

  
  /**
   * C\u00C3\u00B3digo da Conta Corrente
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo da Conta Corrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00C3\u00ADgito Verificador da Conta Corrente
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito Verificador da Conta Corrente")
  public String getDigitoVerificadorContaCorrente() {
    return digitoVerificadorContaCorrente;
  }
  public void setDigitoVerificadorContaCorrente(String digitoVerificadorContaCorrente) {
    this.digitoVerificadorContaCorrente = digitoVerificadorContaCorrente;
  }

  
  /**
   * Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Login do usu\u00C3\u00A1rio para registro da inser\u00C3\u00A7\u00C3\u00A3o")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoaJuridica: ").append(idPessoaJuridica).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  pagamentoSemanal: ").append(pagamentoSemanal).append("\n");
    sb.append("  pagamentoMensal: ").append(pagamentoMensal).append("\n");
    sb.append("  pagamentoDecendialPrimeiro: ").append(pagamentoDecendialPrimeiro).append("\n");
    sb.append("  pagamentoDecendialSegundo: ").append(pagamentoDecendialSegundo).append("\n");
    sb.append("  pagamentoDecendialTerceiro: ").append(pagamentoDecendialTerceiro).append("\n");
    sb.append("  pagamentoQuinzenalPrimeiro: ").append(pagamentoQuinzenalPrimeiro).append("\n");
    sb.append("  pagamentoQuinzenalSegundo: ").append(pagamentoQuinzenalSegundo).append("\n");
    sb.append("  credorBanco: ").append(credorBanco).append("\n");
    sb.append("  percentualRAV: ").append(percentualRAV).append("\n");
    sb.append("  recebeRAV: ").append(recebeRAV).append("\n");
    sb.append("  percentualMultiplica: ").append(percentualMultiplica).append("\n");
    sb.append("  taxaAdm: ").append(taxaAdm).append("\n");
    sb.append("  taxaBanco: ").append(taxaBanco).append("\n");
    sb.append("  limiteRAV: ").append(limiteRAV).append("\n");
    sb.append("  idCredorRAV: ").append(idCredorRAV).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoVerificadorAgencia: ").append(digitoVerificadorAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoVerificadorContaCorrente: ").append(digitoVerificadorContaCorrente).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

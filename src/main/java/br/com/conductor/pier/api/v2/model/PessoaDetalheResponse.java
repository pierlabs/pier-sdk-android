package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PersonDetailResponse
 **/
@ApiModel(description = "PersonDetailResponse")
public class PessoaDetalheResponse  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nomeMae")
  private String nomeMae = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private String idProfissao = null;
  @SerializedName("idNaturezaOcupacao")
  private Long idNaturezaOcupacao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
  @SerializedName("numeroBanco")
  private Integer numeroBanco = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
  @SerializedName("nomeReferencia1")
  private String nomeReferencia1 = null;
  @SerializedName("enderecoReferencia1")
  private String enderecoReferencia1 = null;
  @SerializedName("nomeReferencia2")
  private String nomeReferencia2 = null;
  @SerializedName("enderecoReferencia2")
  private String enderecoReferencia2 = null;
  @SerializedName("salario")
  private BigDecimal salario = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("naturalidadeCidade")
  private String naturalidadeCidade = null;
  @SerializedName("naturalidadeEstado")
  private String naturalidadeEstado = null;
  @SerializedName("grauInstrucao")
  private Integer grauInstrucao = null;
  @SerializedName("numeroDependentes")
  private Integer numeroDependentes = null;
  @SerializedName("nomePai")
  private String nomePai = null;
  @SerializedName("chequeEspecial")
  private Integer chequeEspecial = null;

  
  /**
   * Identifier Code of the Person
   **/
  @ApiModelProperty(value = "Identifier Code of the Person")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Show the name of the mother of the physical person
   **/
  @ApiModelProperty(value = "Show the name of the mother of the physical person")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * Id Marital status of the physical person
   **/
  @ApiModelProperty(value = "Id Marital status of the physical person")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Physical Person Occupation
   **/
  @ApiModelProperty(value = "Physical Person Occupation")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Physical Person Occupation
   **/
  @ApiModelProperty(value = "Physical Person Occupation")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * Id Nationality of the physical person
   **/
  @ApiModelProperty(value = "Id Nationality of the physical person")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * Bank Number
   **/
  @ApiModelProperty(value = "Bank Number")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * Agency Number
   **/
  @ApiModelProperty(value = "Agency Number")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Current Account number
   **/
  @ApiModelProperty(value = "Current Account number")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Physical Person Email
   **/
  @ApiModelProperty(value = "Physical Person Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Name that must be printed on the card
   **/
  @ApiModelProperty(value = "Name that must be printed on the card")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * Name Reference 1
   **/
  @ApiModelProperty(value = "Name Reference 1")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * Reference Address 1
   **/
  @ApiModelProperty(value = "Reference Address 1")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * Name Reference 2
   **/
  @ApiModelProperty(value = "Name Reference 2")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * Reference Address 2
   **/
  @ApiModelProperty(value = "Reference Address 2")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  
  /**
   * Salary
   **/
  @ApiModelProperty(value = "Salary")
  public BigDecimal getSalario() {
    return salario;
  }
  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }

  
  /**
   * Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   **/
  @ApiModelProperty(value = "Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Displays the name of the birth city of the individual
   **/
  @ApiModelProperty(value = "Displays the name of the birth city of the individual")
  public String getNaturalidadeCidade() {
    return naturalidadeCidade;
  }
  public void setNaturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
  }

  
  /**
   * Presents the acronym of the person's state of birth
   **/
  @ApiModelProperty(value = "Presents the acronym of the person's state of birth")
  public String getNaturalidadeEstado() {
    return naturalidadeEstado;
  }
  public void setNaturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
  }

  
  /**
   * It shows the degree of instruction of the individual
   **/
  @ApiModelProperty(value = "It shows the degree of instruction of the individual")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * Displays the number of dependents of the individual
   **/
  @ApiModelProperty(value = "Displays the number of dependents of the individual")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * Displays the name of the parent of the individual
   **/
  @ApiModelProperty(value = "Displays the name of the parent of the individual")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * Indicates whether individual person joins the overdraft
   **/
  @ApiModelProperty(value = "Indicates whether individual person joins the overdraft")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaDetalheResponse {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nomeMae: ").append(nomeMae).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNaturezaOcupacao: ").append(idNaturezaOcupacao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  numeroBanco: ").append(numeroBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  nomeReferencia1: ").append(nomeReferencia1).append("\n");
    sb.append("  enderecoReferencia1: ").append(enderecoReferencia1).append("\n");
    sb.append("  nomeReferencia2: ").append(nomeReferencia2).append("\n");
    sb.append("  enderecoReferencia2: ").append(enderecoReferencia2).append("\n");
    sb.append("  salario: ").append(salario).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("  naturalidadeCidade: ").append(naturalidadeCidade).append("\n");
    sb.append("  naturalidadeEstado: ").append(naturalidadeEstado).append("\n");
    sb.append("  grauInstrucao: ").append(grauInstrucao).append("\n");
    sb.append("  numeroDependentes: ").append(numeroDependentes).append("\n");
    sb.append("  nomePai: ").append(nomePai).append("\n");
    sb.append("  chequeEspecial: ").append(chequeEspecial).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

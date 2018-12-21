package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ObjectAddressApproved;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoResponse;
import br.com.conductor.pier.api.v2.model.SocioAprovadoResponse;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PersonLegalApproedPersist
 **/
@ApiModel(description = "PersonLegalApproedPersist")
public class PessoaJuridicaAprovadaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("dataAberturaEmpresa")
  private String dataAberturaEmpresa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("numeroBanco")
  private Integer numeroBanco = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaResponse> telefones = null;
  @SerializedName("enderecos")
  private List<ObjectAddressApproved> enderecos = null;
  @SerializedName("socios")
  private List<SocioAprovadoResponse> socios = null;
  @SerializedName("referencias")
  private List<ReferenciaComercialAprovadoResponse> referencias = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;

  
  /**
   * Identification Code of the Legal Person (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Legal Person (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the full name of the social reason (business name)
   **/
  @ApiModelProperty(value = "Show the full name of the social reason (business name)")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Show the fantasy name of the company
   **/
  @ApiModelProperty(value = "Show the fantasy name of the company")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * National Register Number of the Legal Person (CNPJ)
   **/
  @ApiModelProperty(value = "National Register Number of the Legal Person (CNPJ)")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * State Enrollment Number (SE)
   **/
  @ApiModelProperty(value = "State Enrollment Number (SE)")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Opening date of the company, this date must be informed in the format: yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Opening date of the company, this date must be informed in the format: yyyy-MM-dd")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id of the commercial origin
   **/
  @ApiModelProperty(value = "Id of the commercial origin")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id of the Product
   **/
  @ApiModelProperty(value = "Id of the Product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Bank number
   **/
  @ApiModelProperty(value = "Bank number")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * Agency number
   **/
  @ApiModelProperty(value = "Agency number")
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
   * Company name
   **/
  @ApiModelProperty(value = "Company name")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Expiration day
   **/
  @ApiModelProperty(value = "Expiration day")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Name that must be printed on the card
   **/
  @ApiModelProperty(value = "Name that must be printed on the card")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Identification Code of the Registered Account
   **/
  @ApiModelProperty(value = "Identification Code of the Registered Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the purpose
   **/
  @ApiModelProperty(value = "Identification Code of the purpose")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Indicate the way which the register of the client was created
   **/
  @ApiModelProperty(value = "Indicate the way which the register of the client was created")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Indicate the value of the score attributed to the client (in case it is not informed it will be attributed the value =0)
   **/
  @ApiModelProperty(value = "Indicate the value of the score attributed to the client (in case it is not informed it will be attributed the value =0)")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Show the telephones of the company
   **/
  @ApiModelProperty(value = "Show the telephones of the company")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * It may be informed the types of address: Residential, Commercial and Others
   **/
  @ApiModelProperty(value = "It may be informed the types of address: Residential, Commercial and Others")
  public List<ObjectAddressApproved> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<ObjectAddressApproved> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Show the dates of the partners in the company, in case that it exists
   **/
  @ApiModelProperty(value = "Show the dates of the partners in the company, in case that it exists")
  public List<SocioAprovadoResponse> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
  }

  
  /**
   * Show the dates of the partners of the company, in case that it exists
   **/
  @ApiModelProperty(value = "Show the dates of the partners of the company, in case that it exists")
  public List<ReferenciaComercialAprovadoResponse> getReferencias() {
    return referencias;
  }
  public void setReferencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
  }

  
  /**
   * Value of the Global limit
   **/
  @ApiModelProperty(required = true, value = "Value of the Global limit")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Maximum value of limit credit to make trnsactions
   **/
  @ApiModelProperty(required = true, value = "Maximum value of limit credit to make trnsactions")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Value of accumulated credit limit of sum of the parcels of the shops
   **/
  @ApiModelProperty(required = true, value = "Value of accumulated credit limit of sum of the parcels of the shops")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  dataAberturaEmpresa: ").append(dataAberturaEmpresa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroBanco: ").append(numeroBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  socios: ").append(socios).append("\n");
    sb.append("  referencias: ").append(referencias).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

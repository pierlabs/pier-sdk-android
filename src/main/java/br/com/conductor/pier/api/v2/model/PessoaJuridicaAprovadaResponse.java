package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EnderecoAprovadoResponse;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoResponse;
import br.com.conductor.pier.api.v2.model.SocioAprovadoResponse;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * PessoaJuridicaAprovadaPersist
 **/
@ApiModel(description = "PessoaJuridicaAprovadaPersist")
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
  private List<EnderecoAprovadoResponse> enderecos = null;
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

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da pessoa jur\u00C3\u00ADdica (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da pessoa jur\u00C3\u00ADdica (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o nome completo da raz\u00C3\u00A3o social (nome empresarial)'.
   **/
  @ApiModelProperty(value = "Apresenta o nome completo da raz\u00C3\u00A3o social (nome empresarial)'.")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Apresenta o nome fantasia da empresa.
   **/
  @ApiModelProperty(value = "Apresenta o nome fantasia da empresa.")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * N\u00C3\u00BAmero do Cadastro Nacional de Pessoa Juridica (CNPJ)
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do Cadastro Nacional de Pessoa Juridica (CNPJ)")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00C3\u00BAmero da Inscri\u00C3\u00A7\u00C3\u00A3o Estadual (IE).
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Inscri\u00C3\u00A7\u00C3\u00A3o Estadual (IE).")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd.
   **/
  @ApiModelProperty(value = "Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd.")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id da origem comercial
   **/
  @ApiModelProperty(value = "Id da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id do produto
   **/
  @ApiModelProperty(value = "Id do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
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
   * Email da empresa
   **/
  @ApiModelProperty(value = "Email da empresa")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Dia vencimento
   **/
  @ApiModelProperty(value = "Dia vencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Nome que deve ser impresso no cart\u00C3\u00A3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta cadastrada
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta cadastrada")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da proposta
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da proposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Indica o canal pelo qual o cadastro do cliente foi realizado
   **/
  @ApiModelProperty(value = "Indica o canal pelo qual o cadastro do cliente foi realizado")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Indica o valor da pontua\u00C3\u00A7\u00C3\u00A3o atribuido ao cliente (caso n\u00C3\u00A3o informado ser\u00C3\u00A1 atribuido o valor = 0)
   **/
  @ApiModelProperty(value = "Indica o valor da pontua\u00C3\u00A7\u00C3\u00A3o atribuido ao cliente (caso n\u00C3\u00A3o informado ser\u00C3\u00A1 atribuido o valor = 0)")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Apresenta os telefones da empresa
   **/
  @ApiModelProperty(value = "Apresenta os telefones da empresa")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Pode ser informado os seguintes tipos de endere\u00C3\u00A7o: Residencial, Comercial, e Outros
   **/
  @ApiModelProperty(value = "Pode ser informado os seguintes tipos de endere\u00C3\u00A7o: Residencial, Comercial, e Outros")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista
   **/
  @ApiModelProperty(value = "Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista")
  public List<SocioAprovadoResponse> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
  }

  
  /**
   * Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista
   **/
  @ApiModelProperty(value = "Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista")
  public List<ReferenciaComercialAprovadoResponse> getReferencias() {
    return referencias;
  }
  public void setReferencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
  }

  
  /**
   * Valor do Limite Global
   **/
  @ApiModelProperty(required = true, value = "Valor do Limite Global")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Valor m\u00C3\u00A1ximo do limite de cr\u00C3\u00A9dito para realizar transa\u00C3\u00A7\u00C3\u00B5es
   **/
  @ApiModelProperty(required = true, value = "Valor m\u00C3\u00A1ximo do limite de cr\u00C3\u00A9dito para realizar transa\u00C3\u00A7\u00C3\u00B5es")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor do limite de cr\u00C3\u00A9dito acumulado da soma das parcelas das compras
   **/
  @ApiModelProperty(required = true, value = "Valor do limite de cr\u00C3\u00A9dito acumulado da soma das parcelas das compras")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
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
    sb.append("}\n");
    return sb.toString();
  }
}



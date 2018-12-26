package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ObjetoEndereoAprovadoPersist;
import br.com.conductor.pier.api.v2.model.PessoaPersist;
import br.com.conductor.pier.api.v2.model.RefenciaComercialAprovadoPersist;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PessoaJuridicaAprovadaPersist
 **/
@ApiModel(description = "PessoaJuridicaAprovadaPersist")
public class PessoaJuridicaAprovadaPersist  {
  
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
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaPersist> telefones = null;
  @SerializedName("enderecos")
  private List<ObjetoEndereoAprovadoPersist> enderecos = null;
  @SerializedName("socios")
  private List<PessoaPersist> socios = null;
  @SerializedName("referenciasComerciais")
  private List<RefenciaComercialAprovadoPersist> referenciasComerciais = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;

  
  /**
   * Apresenta o nome completo da raz\u00E3o social (nome empresarial)'
   **/
  @ApiModelProperty(required = true, value = "Apresenta o nome completo da raz\u00E3o social (nome empresarial)'")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Apresenta o nome fantasia da empresa
   **/
  @ApiModelProperty(value = "Apresenta o nome fantasia da empresa")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * CNPJ da Pessoa Fisica
   **/
  @ApiModelProperty(required = true, value = "CNPJ da Pessoa Fisica")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00FAmero da Inscri\u00E7\u00E3o Estadual (IE)
   **/
  @ApiModelProperty(value = "N\u00FAmero da Inscri\u00E7\u00E3o Estadual (IE)")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd
   **/
  @ApiModelProperty(required = true, value = "Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id da origem comercial
   **/
  @ApiModelProperty(required = true, value = "Id da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id do produto
   **/
  @ApiModelProperty(required = true, value = "Id do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * N\u00FAmero do banco
   **/
  @ApiModelProperty(value = "N\u00FAmero do banco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  @ApiModelProperty(value = "N\u00FAmero da ag\u00EAncia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  @ApiModelProperty(value = "N\u00FAmero da conta corrente")
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
  @ApiModelProperty(required = true, value = "Dia vencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome que deve ser impresso no cart\u00E3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta o valor da renda compravada
   **/
  @ApiModelProperty(value = "Apresenta o valor da renda compravada")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
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
   * Indica o valor da pontua\u00E7\u00E3o atribuido ao cliente (caso n\u00E3o informado ser\u00E1 atribuido o valor =0)
   **/
  @ApiModelProperty(value = "Indica o valor da pontua\u00E7\u00E3o atribuido ao cliente (caso n\u00E3o informado ser\u00E1 atribuido o valor =0)")
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
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Pode ser informado os seguintes tipos de endere\u00E7o: Residencial, Comercial, e Outros
   **/
  @ApiModelProperty(required = true, value = "Pode ser informado os seguintes tipos de endere\u00E7o: Residencial, Comercial, e Outros")
  public List<ObjetoEndereoAprovadoPersist> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<ObjetoEndereoAprovadoPersist> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Apresenta os dados dos s\u00F3cios da empresa, caso exista
   **/
  @ApiModelProperty(value = "Apresenta os dados dos s\u00F3cios da empresa, caso exista")
  public List<PessoaPersist> getSocios() {
    return socios;
  }
  public void setSocios(List<PessoaPersist> socios) {
    this.socios = socios;
  }

  
  /**
   * Apresenta os dados das refer\u00EAncias comerciais
   **/
  @ApiModelProperty(value = "Apresenta os dados das refer\u00EAncias comerciais")
  public List<RefenciaComercialAprovadoPersist> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<RefenciaComercialAprovadoPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
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
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   **/
  @ApiModelProperty(required = true, value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras
   **/
  @ApiModelProperty(required = true, value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito (Lei n. 4.595/64)
   **/
  @ApiModelProperty(value = "Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito (Lei n. 4.595/64)")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaPersist {\n");
    
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
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  socios: ").append(socios).append("\n");
    sb.append("  referenciasComerciais: ").append(referenciasComerciais).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

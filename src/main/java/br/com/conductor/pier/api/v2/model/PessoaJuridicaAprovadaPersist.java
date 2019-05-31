package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersist;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoPersist;
import br.com.conductor.pier.api.v2.model.SocioAprovadoPersist;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia da Pessoa Juridica Aprovada
 **/
@ApiModel(description = "Objeto de persist\u00EAncia da Pessoa Juridica Aprovada")
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
  private List<EnderecoAprovadoPersist> enderecos = null;
  @SerializedName("socios")
  private List<SocioAprovadoPersist> socios = null;
  @SerializedName("referenciasComerciais")
  private List<ReferenciaComercialAprovadoPersist> referenciasComerciais = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("cnae")
  private String cnae = null;
  @SerializedName("formaConstituicao")
  private String formaConstituicao = null;

  
  /**
   * Nome completo da raz\u00E3o social. \u00C9 o nome empresarial
   **/
  @ApiModelProperty(required = true, value = "Nome completo da raz\u00E3o social. \u00C9 o nome empresarial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Nome fantasia da empresa
   **/
  @ApiModelProperty(value = "Nome fantasia da empresa")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * Number of the National Registry of Legal Entity
   **/
  @ApiModelProperty(required = true, value = "Number of the National Registry of Legal Entity")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00FAmero da Inscri\u00E7\u00E3o Estadual
   **/
  @ApiModelProperty(value = "N\u00FAmero da Inscri\u00E7\u00E3o Estadual")
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
   * C\u00F3digo identificador da origem comercial
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do produto")
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
   * Nome impresso no cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome impresso no cart\u00E3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Valor da renda comprovada
   **/
  @ApiModelProperty(value = "Valor da renda comprovada")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Canal pelo qual o cadastro do cliente foi realizado
   **/
  @ApiModelProperty(value = "Canal pelo qual o cadastro do cliente foi realizado")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente. Default: 0
   **/
  @ApiModelProperty(value = "Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente. Default: 0")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Telefones da empresa
   **/
  @ApiModelProperty(required = true, value = "Telefones da empresa")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Enderecos da empresa
   **/
  @ApiModelProperty(required = true, value = "Enderecos da empresa")
  public List<EnderecoAprovadoPersist> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersist> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * S\u00F3cios da empresa
   **/
  @ApiModelProperty(required = true, value = "S\u00F3cios da empresa")
  public List<SocioAprovadoPersist> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoPersist> socios) {
    this.socios = socios;
  }

  
  /**
   * Refer\u00EAncias comerciais da Empresa
   **/
  @ApiModelProperty(value = "Refer\u00EAncias comerciais da Empresa")
  public List<ReferenciaComercialAprovadoPersist> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<ReferenciaComercialAprovadoPersist> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
  }

  
  /**
   * Valor do Limite Global para a conta
   **/
  @ApiModelProperty(value = "Valor do Limite Global para a conta")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Indicativo para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito (Lei n. 4.595/64)
   **/
  @ApiModelProperty(value = "Indicativo para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito (Lei n. 4.595/64)")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * C\u00F3digo de Classifica\u00E7\u00E3o Nacional de Atividades Econ\u00F4micas
   **/
  @ApiModelProperty(value = "C\u00F3digo de Classifica\u00E7\u00E3o Nacional de Atividades Econ\u00F4micas")
  public String getCnae() {
    return cnae;
  }
  public void setCnae(String cnae) {
    this.cnae = cnae;
  }

  
  /**
   * Forma de atos constitutivos de uma atividade empresarial
   **/
  @ApiModelProperty(value = "Forma de atos constitutivos de uma atividade empresarial")
  public String getFormaConstituicao() {
    return formaConstituicao;
  }
  public void setFormaConstituicao(String formaConstituicao) {
    this.formaConstituicao = formaConstituicao;
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
    sb.append("  cnae: ").append(cnae).append("\n");
    sb.append("  formaConstituicao: ").append(formaConstituicao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

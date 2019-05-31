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
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("cnae")
  private String cnae = null;
  @SerializedName("formaConstituicao")
  private String formaConstituicao = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa jur\u00EDdica")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome completo da raz\u00E3o social. \u00C9 o nome empresarial
   **/
  @ApiModelProperty(value = "Nome completo da raz\u00E3o social. \u00C9 o nome empresarial")
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
   * N\u00FAmero do Cadastro Nacional da Pessoa Jur\u00EDdica
   **/
  @ApiModelProperty(value = "N\u00FAmero do Cadastro Nacional da Pessoa Jur\u00EDdica")
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
   * Data de abertura da empresa
   **/
  @ApiModelProperty(value = "Data de abertura da empresa")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do produto")
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
  @ApiModelProperty(value = "Dia vencimento")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da conta cadastrada
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta cadastrada")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
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
   * Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente
   **/
  @ApiModelProperty(value = "Valor da pontua\u00E7\u00E3o atribu\u00EDdo ao cliente")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Telefones da empresa
   **/
  @ApiModelProperty(value = "Telefones da empresa")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Enderecos da empresa
   **/
  @ApiModelProperty(value = "Enderecos da empresa")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * S\u00F3cios da empresa
   **/
  @ApiModelProperty(value = "S\u00F3cios da empresa")
  public List<SocioAprovadoResponse> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoResponse> socios) {
    this.socios = socios;
  }

  
  /**
   * Refer\u00EAncias comerciais da Empresa
   **/
  @ApiModelProperty(value = "Refer\u00EAncias comerciais da Empresa")
  public List<ReferenciaComercialAprovadoResponse> getReferencias() {
    return referencias;
  }
  public void setReferencias(List<ReferenciaComercialAprovadoResponse> referencias) {
    this.referencias = referencias;
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
    sb.append("  cnae: ").append(cnae).append("\n");
    sb.append("  formaConstituicao: ").append(formaConstituicao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

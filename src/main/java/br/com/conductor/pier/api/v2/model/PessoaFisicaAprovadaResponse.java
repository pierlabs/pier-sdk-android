package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EnderecoAprovadoResponse;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PessoaFisicaAprovadaResponse
 **/
@ApiModel(description = "PessoaFisicaAprovadaResponse")
public class PessoaFisicaAprovadaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeMae")
  private String nomeMae = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private String idProfissao = null;
  @SerializedName("idNaturezaOcupacao")
  private Long idNaturezaOcupacao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
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
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
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
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da pessoa fisica (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da pessoa fisica (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o nome completo da pessoa fisica.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o nome completo da pessoa fisica.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Apresenta o nome da m\u00E3e da pessoa fisica
   **/
  @ApiModelProperty(value = "Apresenta o nome da m\u00E3e da pessoa fisica")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * Data de Nascimento da Pessoa. Essa data deve ser informada no formato aaaa-MM-dd.
   **/
  @ApiModelProperty(value = "Data de Nascimento da Pessoa. Essa data deve ser informada no formato aaaa-MM-dd.")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino).
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino).")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero do Cadastro de Pessoa Fisica (CPF)
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do Cadastro de Pessoa Fisica (CPF)")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * N\u00FAmero da identidade.
   **/
  @ApiModelProperty(value = "N\u00FAmero da identidade.")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00E3o expedidor da Identidade.
   **/
  @ApiModelProperty(value = "Org\u00E3o expedidor da Identidade.")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa de onde foi expedido a Identidade
   **/
  @ApiModelProperty(value = "Sigla da Unidade Federativa de onde foi expedido a Identidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data emiss\u00E3o da Identidade no formato aaaa-MM-dd
   **/
  @ApiModelProperty(value = "Data emiss\u00E3o da Identidade no formato aaaa-MM-dd")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Id Estado civil da pessoa fisica
   **/
  @ApiModelProperty(value = "Id Estado civil da pessoa fisica")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Profiss\u00E3o da pessoa fisica
   **/
  @ApiModelProperty(value = "Profiss\u00E3o da pessoa fisica")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   **/
  @ApiModelProperty(value = "Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * Id Nacionalidade da pessoa fisica
   **/
  @ApiModelProperty(value = "Id Nacionalidade da pessoa fisica")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
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
   * N\u00FAmero da ag\u00EAncia.
   **/
  @ApiModelProperty(value = "N\u00FAmero da ag\u00EAncia.")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente.
   **/
  @ApiModelProperty(value = "N\u00FAmero da conta corrente.")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email da pessoa fisica
   **/
  @ApiModelProperty(value = "Email da pessoa fisica")
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
   * Nome da empresa
   **/
  @ApiModelProperty(value = "Nome da empresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
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
   * Indica o valor da pontua\u00E7\u00E3o atribuido ao cliente (caso n\u00E3o informado ser\u00E1 atribuido o valor = 0)
   **/
  @ApiModelProperty(value = "Indica o valor da pontua\u00E7\u00E3o atribuido ao cliente (caso n\u00E3o informado ser\u00E1 atribuido o valor = 0)")
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
   * Pode ser informado os seguintes tipos de endere\u00E7o: Residencial, Comercial, e Outros
   **/
  @ApiModelProperty(required = true, value = "Pode ser informado os seguintes tipos de endere\u00E7o: Residencial, Comercial, e Outros")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
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
   * Valor do limite de margem consignado
   **/
  @ApiModelProperty(required = true, value = "Valor do limite de margem consignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaAprovadaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeMae: ").append(nomeMae).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNaturezaOcupacao: ").append(idNaturezaOcupacao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

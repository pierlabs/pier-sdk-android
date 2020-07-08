package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PessoaDetalheResponse
 **/
@ApiModel(description = "PessoaDetalheResponse")
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
  @SerializedName("numeroCnh")
  private String numeroCnh = null;
  @SerializedName("pessoaPoliticamenteExposta")
  private Boolean pessoaPoliticamenteExposta = null;
  @SerializedName("patrimonioTotal")
  private BigDecimal patrimonioTotal = null;
  @SerializedName("nomeConjuge")
  private String nomeConjuge = null;
  @SerializedName("flagNomePaiNaoInformado")
  private Boolean flagNomePaiNaoInformado = null;
  @SerializedName("flagSemEnderecoComercialFixo")
  private Boolean flagSemEnderecoComercialFixo = null;
  @SerializedName("dataEmissaoCnh")
  private String dataEmissaoCnh = null;

  
  /**
   * C\u00F3digo identificador da pessoa
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
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
   * Nome que deve ser impresso no cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome que deve ser impresso no cart\u00E3o")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * Nome de refer\u00EAncia 1
   **/
  @ApiModelProperty(value = "Nome de refer\u00EAncia 1")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * Endere\u00E7o de refer\u00EAncia 1
   **/
  @ApiModelProperty(value = "Endere\u00E7o de refer\u00EAncia 1")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * Nome de refer\u00EAncia 2
   **/
  @ApiModelProperty(value = "Nome de refer\u00EAncia 2")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * Endere\u00E7o de refer\u00EAncia 2
   **/
  @ApiModelProperty(value = "Endere\u00E7o de refer\u00EAncia 2")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  
  /**
   * Sal\u00E1rio
   **/
  @ApiModelProperty(value = "Sal\u00E1rio")
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
   * Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica")
  public String getNaturalidadeCidade() {
    return naturalidadeCidade;
  }
  public void setNaturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
  }

  
  /**
   * Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica")
  public String getNaturalidadeEstado() {
    return naturalidadeEstado;
  }
  public void setNaturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
  }

  
  /**
   * Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * Apresenta o nome do pai da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "Apresenta o nome do pai da pessoa f\u00EDsica")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * Indica se pessoa f\u00EDsica aderir ao cheque especial
   **/
  @ApiModelProperty(value = "Indica se pessoa f\u00EDsica aderir ao cheque especial")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  
  /**
   * N\u00FAmero da CNH da pessoa
   **/
  @ApiModelProperty(value = "N\u00FAmero da CNH da pessoa")
  public String getNumeroCnh() {
    return numeroCnh;
  }
  public void setNumeroCnh(String numeroCnh) {
    this.numeroCnh = numeroCnh;
  }

  
  /**
   * Flag para identificar se a pessoa \u00E9 politicamente exposta
   **/
  @ApiModelProperty(value = "Flag para identificar se a pessoa \u00E9 politicamente exposta")
  public Boolean getPessoaPoliticamenteExposta() {
    return pessoaPoliticamenteExposta;
  }
  public void setPessoaPoliticamenteExposta(Boolean pessoaPoliticamenteExposta) {
    this.pessoaPoliticamenteExposta = pessoaPoliticamenteExposta;
  }

  
  /**
   * Patrim\u00F4nio total da pessoa
   **/
  @ApiModelProperty(value = "Patrim\u00F4nio total da pessoa")
  public BigDecimal getPatrimonioTotal() {
    return patrimonioTotal;
  }
  public void setPatrimonioTotal(BigDecimal patrimonioTotal) {
    this.patrimonioTotal = patrimonioTotal;
  }

  
  /**
   * Nome do c\u00F4njuge da pessoa
   **/
  @ApiModelProperty(value = "Nome do c\u00F4njuge da pessoa")
  public String getNomeConjuge() {
    return nomeConjuge;
  }
  public void setNomeConjuge(String nomeConjuge) {
    this.nomeConjuge = nomeConjuge;
  }

  
  /**
   * Flag que indica se a pessoa informou nome do pai
   **/
  @ApiModelProperty(value = "Flag que indica se a pessoa informou nome do pai")
  public Boolean getFlagNomePaiNaoInformado() {
    return flagNomePaiNaoInformado;
  }
  public void setFlagNomePaiNaoInformado(Boolean flagNomePaiNaoInformado) {
    this.flagNomePaiNaoInformado = flagNomePaiNaoInformado;
  }

  
  /**
   * Flag que indica se a pessoa possui endere\u00E7o comercial fixo
   **/
  @ApiModelProperty(value = "Flag que indica se a pessoa possui endere\u00E7o comercial fixo")
  public Boolean getFlagSemEnderecoComercialFixo() {
    return flagSemEnderecoComercialFixo;
  }
  public void setFlagSemEnderecoComercialFixo(Boolean flagSemEnderecoComercialFixo) {
    this.flagSemEnderecoComercialFixo = flagSemEnderecoComercialFixo;
  }

  
  /**
   * Data emiss\u00E3o CNH
   **/
  @ApiModelProperty(value = "Data emiss\u00E3o CNH")
  public String getDataEmissaoCnh() {
    return dataEmissaoCnh;
  }
  public void setDataEmissaoCnh(String dataEmissaoCnh) {
    this.dataEmissaoCnh = dataEmissaoCnh;
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
    sb.append("  numeroCnh: ").append(numeroCnh).append("\n");
    sb.append("  pessoaPoliticamenteExposta: ").append(pessoaPoliticamenteExposta).append("\n");
    sb.append("  patrimonioTotal: ").append(patrimonioTotal).append("\n");
    sb.append("  nomeConjuge: ").append(nomeConjuge).append("\n");
    sb.append("  flagNomePaiNaoInformado: ").append(flagNomePaiNaoInformado).append("\n");
    sb.append("  flagSemEnderecoComercialFixo: ").append(flagSemEnderecoComercialFixo).append("\n");
    sb.append("  dataEmissaoCnh: ").append(dataEmissaoCnh).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

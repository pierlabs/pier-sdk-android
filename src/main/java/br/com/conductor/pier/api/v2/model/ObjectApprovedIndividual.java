package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ObjectAddressApproved;
import br.com.conductor.pier.api.v2.model.TelephonePersonApprovedPersist;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ObjectApprovedIndividual  {
  
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
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("telefones")
  private List<TelephonePersonApprovedPersist> telefones = null;
  @SerializedName("enderecos")
  private List<ObjectAddressApproved> enderecos = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("nomeReferencia1")
  private String nomeReferencia1 = null;
  @SerializedName("enderecoReferencia1")
  private String enderecoReferencia1 = null;
  @SerializedName("nomeReferencia2")
  private String nomeReferencia2 = null;
  @SerializedName("enderecoReferencia2")
  private String enderecoReferencia2 = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
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
  @SerializedName("numeroBanco")
  private Integer numeroBanco = null;
  @SerializedName("matricula")
  private String matricula = null;
  @SerializedName("responsavelDigitacao")
  private String responsavelDigitacao = null;
  @SerializedName("idPromotorVenda")
  private Integer idPromotorVenda = null;

  
  /**
   * Show the full name of the physical person
   **/
  @ApiModelProperty(required = true, value = "Show the full name of the physical person")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Show the name of the mother of physical person
   **/
  @ApiModelProperty(value = "Show the name of the mother of physical person")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * Birth date of the Person. This date must be informed in the format yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Birth date of the Person. This date must be informed in the format yyyy-MM-dd")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Code of identification of the sex of the Person, when PF, being: ('M': Male), ('F': Female)
   **/
  @ApiModelProperty(value = "Code of identification of the sex of the Person, when PF, being: ('M': Male), ('F': Female)")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * CPF number
   **/
  @ApiModelProperty(required = true, value = "CPF number")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Identity Number
   **/
  @ApiModelProperty(value = "Identity Number")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Issuer organ of the ID
   **/
  @ApiModelProperty(value = "Issuer organ of the ID")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Acronym of the federal unity where it was issued the ID
   **/
  @ApiModelProperty(value = "Acronym of the federal unity where it was issued the ID")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Issue date of the identity in the format yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Issue date of the identity in the format yyyy-MM-dd")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Id Marital Status of the Physical Person
   **/
  @ApiModelProperty(value = "Id Marital Status of the Physical Person")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Occupation of the physical person
   **/
  @ApiModelProperty(value = "Occupation of the physical person")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Id Occupation of the physical person
   **/
  @ApiModelProperty(value = "Id Occupation of the physical person")
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
   * Id of the commercial origin
   **/
  @ApiModelProperty(required = true, value = "Id of the commercial origin")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id of the product
   **/
  @ApiModelProperty(required = true, value = "Id of the product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
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
   * Email of the physical Person
   **/
  @ApiModelProperty(value = "Email of the physical Person")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Expiration date
   **/
  @ApiModelProperty(required = true, value = "Expiration date")
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
   * Show the proven income value
   **/
  @ApiModelProperty(value = "Show the proven income value")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Indicate the channel which the client register was made
   **/
  @ApiModelProperty(value = "Indicate the channel which the client register was made")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Indicate the value of the punctuation attributed to the client (case it is not informed it will be attributed the value =0)
   **/
  @ApiModelProperty(value = "Indicate the value of the punctuation attributed to the client (case it is not informed it will be attributed the value =0)")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Show the telephones of the company
   **/
  @ApiModelProperty(required = true, value = "Show the telephones of the company")
  public List<TelephonePersonApprovedPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelephonePersonApprovedPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * It can be informed the following types of address: Residencial, Commerical and Others
   **/
  @ApiModelProperty(required = true, value = "It can be informed the following types of address: Residencial, Commerical and Others")
  public List<ObjectAddressApproved> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<ObjectAddressApproved> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Value of the Global Limit
   **/
  @ApiModelProperty(required = true, value = "Value of the Global Limit")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Maximum value of the credit limit to make transactions
   **/
  @ApiModelProperty(required = true, value = "Maximum value of the credit limit to make transactions")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor do limite de cr?dito acumulado da soma das parcelas das compras
   **/
  @ApiModelProperty(required = true, value = "Valor do limite de cr?dito acumulado da soma das parcelas das compras")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Value of the consigned margin limit
   **/
  @ApiModelProperty(value = "Value of the consigned margin limit")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
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
   * Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   **/
  @ApiModelProperty(value = "Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) ")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes
   **/
  @ApiModelProperty(value = "Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Displays the name of the birth city
   **/
  @ApiModelProperty(value = "Displays the name of the birth city")
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
   * It shows the degree of instruction
   **/
  @ApiModelProperty(value = "It shows the degree of instruction")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * Displays the number of dependents
   **/
  @ApiModelProperty(value = "Displays the number of dependents")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * Displays the name of the parent
   **/
  @ApiModelProperty(value = "Displays the name of the parent")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * Indicates whether you will join the overdraft
   **/
  @ApiModelProperty(value = "Indicates whether you will join the overdraft")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
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
   * License Plate Number
   **/
  @ApiModelProperty(value = "License Plate Number")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * Responsible for typing the proposal
   **/
  @ApiModelProperty(value = "Responsible for typing the proposal")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * Sale promoter identification code
   **/
  @ApiModelProperty(value = "Sale promoter identification code")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectApprovedIndividual {\n");
    
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
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  nomeReferencia1: ").append(nomeReferencia1).append("\n");
    sb.append("  enderecoReferencia1: ").append(enderecoReferencia1).append("\n");
    sb.append("  nomeReferencia2: ").append(nomeReferencia2).append("\n");
    sb.append("  enderecoReferencia2: ").append(enderecoReferencia2).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  naturalidadeCidade: ").append(naturalidadeCidade).append("\n");
    sb.append("  naturalidadeEstado: ").append(naturalidadeEstado).append("\n");
    sb.append("  grauInstrucao: ").append(grauInstrucao).append("\n");
    sb.append("  numeroDependentes: ").append(numeroDependentes).append("\n");
    sb.append("  nomePai: ").append(nomePai).append("\n");
    sb.append("  chequeEspecial: ").append(chequeEspecial).append("\n");
    sb.append("  numeroBanco: ").append(numeroBanco).append("\n");
    sb.append("  matricula: ").append(matricula).append("\n");
    sb.append("  responsavelDigitacao: ").append(responsavelDigitacao).append("\n");
    sb.append("  idPromotorVenda: ").append(idPromotorVenda).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

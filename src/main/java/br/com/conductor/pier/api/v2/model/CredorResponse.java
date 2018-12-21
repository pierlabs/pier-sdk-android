package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneEscritorioCobrancaDTO;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CredorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCredor")
  private String nomeCredor = null;
  @SerializedName("diaPagamentoSemanal")
  private Integer diaPagamentoSemanal = null;
  @SerializedName("diaPagamentoMensal")
  private Integer diaPagamentoMensal = null;
  @SerializedName("diaPagamentoDecendialPrimeiro")
  private Integer diaPagamentoDecendialPrimeiro = null;
  @SerializedName("diaPagamentoDecendialSegundo")
  private Integer diaPagamentoDecendialSegundo = null;
  @SerializedName("diaPagamentoDecendialTerceiro")
  private Integer diaPagamentoDecendialTerceiro = null;
  @SerializedName("diaPagamentoQuinzenalPrimeiro")
  private Integer diaPagamentoQuinzenalPrimeiro = null;
  @SerializedName("diaPagamentoQuinzenalSegundo")
  private Integer diaPagamentoQuinzenalSegundo = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoContaCorrente")
  private String digitoContaCorrente = null;
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
  @SerializedName("taxaAdministrativa")
  private BigDecimal taxaAdministrativa = null;
  @SerializedName("taxaBanco")
  private BigDecimal taxaBanco = null;
  @SerializedName("limiteRAV")
  private BigDecimal limiteRAV = null;
  @SerializedName("idCredorRAV")
  private Long idCredorRAV = null;
  public enum PeriodicidadeEnum {
     DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
  };
  @SerializedName("periodicidade")
  private PeriodicidadeEnum periodicidade = null;
  @SerializedName("idPessoaJuridica")
  private Long idPessoaJuridica = null;
  @SerializedName("flagEscritorioCobranca")
  private Boolean flagEscritorioCobranca = null;
  @SerializedName("prefixo")
  private String prefixo = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("telefonesEscritoriosCobranca")
  private List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca = null;
  @SerializedName("nomeContato")
  private String nomeContato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private Integer numeroEndereco = null;
  @SerializedName("complementoEndereco")
  private String complementoEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("flagSegundaViaAcordo")
  private Integer flagSegundaViaAcordo = null;
  @SerializedName("valorMinimoParcela")
  private BigDecimal valorMinimoParcela = null;
  @SerializedName("descontoMaximo")
  private BigDecimal descontoMaximo = null;

  
  /**
   * lender response id lender
   **/
  @ApiModelProperty(value = "lender response id lender")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * lender response name lender
   **/
  @ApiModelProperty(value = "lender response name lender")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * creditor response weekly payment
   **/
  @ApiModelProperty(value = "creditor response weekly payment")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * creditor response monthly payment
   **/
  @ApiModelProperty(value = "creditor response monthly payment")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * lender pays off the first ten-day payment
   **/
  @ApiModelProperty(value = "lender pays off the first ten-day payment")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * lender pays second decimal payment
   **/
  @ApiModelProperty(value = "lender pays second decimal payment")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * creditor replies third decimal payment
   **/
  @ApiModelProperty(value = "creditor replies third decimal payment")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * lender replies biweekly payment first
   **/
  @ApiModelProperty(value = "lender replies biweekly payment first")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * lender replies biweekly payment first
   **/
  @ApiModelProperty(value = "lender replies biweekly payment first")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * bank lender response
   **/
  @ApiModelProperty(value = "bank lender response")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * lender response agency
   **/
  @ApiModelProperty(value = "lender response agency")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * lender response agency digit
   **/
  @ApiModelProperty(value = "lender response agency digit")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * creditor response checking account
   **/
  @ApiModelProperty(value = "creditor response checking account")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * current account lender
   **/
  @ApiModelProperty(value = "current account lender")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * lender response bank creditor
   **/
  @ApiModelProperty(value = "lender response bank creditor")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * percent rav response creditor
   **/
  @ApiModelProperty(value = "percent rav response creditor")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * creditor response receives rav
   **/
  @ApiModelProperty(value = "creditor response receives rav")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * percentage response creditor multiplies
   **/
  @ApiModelProperty(value = "percentage response creditor multiplies")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * lender response rate adm
   **/
  @ApiModelProperty(value = "lender response rate adm")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * creditor bank rate response
   **/
  @ApiModelProperty(value = "creditor bank rate response")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * creditor response limit rav
   **/
  @ApiModelProperty(value = "creditor response limit rav")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * creditor response id creditor rav
   **/
  @ApiModelProperty(value = "creditor response id creditor rav")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * creditor request periodicity
   **/
  @ApiModelProperty(value = "creditor request periodicity")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * creditor request legal id person
   **/
  @ApiModelProperty(value = "creditor request legal id person")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * creditor response flag billing desk
   **/
  @ApiModelProperty(value = "creditor response flag billing desk")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * Cerdor response prefix desktop collection
   **/
  @ApiModelProperty(value = "Cerdor response prefix desktop collection")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * Creditor response active desktop collection
   **/
  @ApiModelProperty(value = "Creditor response active desktop collection")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * creditor response telephone bill collection
   **/
  @ApiModelProperty(value = "creditor response telephone bill collection")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  
  /**
   * Lender response name contact desk collection
   **/
  @ApiModelProperty(value = "Lender response name contact desk collection")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * Creditor response email contact desktop collection
   **/
  @ApiModelProperty(value = "Creditor response email contact desktop collection")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Creditor response public place office collection
   **/
  @ApiModelProperty(value = "Creditor response public place office collection")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * Creditor response number address desk collection
   **/
  @ApiModelProperty(value = "Creditor response number address desk collection")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Creditor response complement address desk collection
   **/
  @ApiModelProperty(value = "Creditor response complement address desk collection")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * Lender response neighborhood desk collection
   **/
  @ApiModelProperty(value = "Lender response neighborhood desk collection")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Creditor response city desk collection
   **/
  @ApiModelProperty(value = "Creditor response city desk collection")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Lender response cep desktop collection
   **/
  @ApiModelProperty(value = "Lender response cep desktop collection")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Creditor response uf desktop collection
   **/
  @ApiModelProperty(value = "Creditor response uf desktop collection")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Creditor response responsible desk charge
   **/
  @ApiModelProperty(value = "Creditor response responsible desk charge")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Lender response flag second via agreement desk collection
   **/
  @ApiModelProperty(value = "Lender response flag second via agreement desk collection")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * Lender response value minimum desktop collection
   **/
  @ApiModelProperty(value = "Lender response value minimum desktop collection")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Creditor response discount maximum desktop collection
   **/
  @ApiModelProperty(value = "Creditor response discount maximum desktop collection")
  public BigDecimal getDescontoMaximo() {
    return descontoMaximo;
  }
  public void setDescontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nomeCredor: ").append(nomeCredor).append("\n");
    sb.append("  diaPagamentoSemanal: ").append(diaPagamentoSemanal).append("\n");
    sb.append("  diaPagamentoMensal: ").append(diaPagamentoMensal).append("\n");
    sb.append("  diaPagamentoDecendialPrimeiro: ").append(diaPagamentoDecendialPrimeiro).append("\n");
    sb.append("  diaPagamentoDecendialSegundo: ").append(diaPagamentoDecendialSegundo).append("\n");
    sb.append("  diaPagamentoDecendialTerceiro: ").append(diaPagamentoDecendialTerceiro).append("\n");
    sb.append("  diaPagamentoQuinzenalPrimeiro: ").append(diaPagamentoQuinzenalPrimeiro).append("\n");
    sb.append("  diaPagamentoQuinzenalSegundo: ").append(diaPagamentoQuinzenalSegundo).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("  credorBanco: ").append(credorBanco).append("\n");
    sb.append("  percentualRAV: ").append(percentualRAV).append("\n");
    sb.append("  recebeRAV: ").append(recebeRAV).append("\n");
    sb.append("  percentualMultiplica: ").append(percentualMultiplica).append("\n");
    sb.append("  taxaAdministrativa: ").append(taxaAdministrativa).append("\n");
    sb.append("  taxaBanco: ").append(taxaBanco).append("\n");
    sb.append("  limiteRAV: ").append(limiteRAV).append("\n");
    sb.append("  idCredorRAV: ").append(idCredorRAV).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  idPessoaJuridica: ").append(idPessoaJuridica).append("\n");
    sb.append("  flagEscritorioCobranca: ").append(flagEscritorioCobranca).append("\n");
    sb.append("  prefixo: ").append(prefixo).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  telefonesEscritoriosCobranca: ").append(telefonesEscritoriosCobranca).append("\n");
    sb.append("  nomeContato: ").append(nomeContato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  complementoEndereco: ").append(complementoEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  flagSegundaViaAcordo: ").append(flagSegundaViaAcordo).append("\n");
    sb.append("  valorMinimoParcela: ").append(valorMinimoParcela).append("\n");
    sb.append("  descontoMaximo: ").append(descontoMaximo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

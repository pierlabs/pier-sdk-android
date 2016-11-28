package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Cart\u00C3\u00A3o para Impresso
 **/
@ApiModel(description = "Objeto Cart\u00C3\u00A3o para Impresso")
public class CartaoImpressao  {
  
  @SerializedName("centroCustoConta")
  private String centroCustoConta = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("cvv2")
  private String cvv2 = null;
  @SerializedName("dataGeracao")
  private Date dataGeracao = null;
  @SerializedName("dataValidade")
  private Date dataValidade = null;
  @SerializedName("idBandeira")
  private Long idBandeira = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("nomeEmpregador")
  private String nomeEmpregador = null;
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
  @SerializedName("nomeEmpresaBeneficio")
  private String nomeEmpresaBeneficio = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("numeroContaCorente")
  private String numeroContaCorente = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("trilha1")
  private String trilha1 = null;
  @SerializedName("trilha2")
  private String trilha2 = null;
  @SerializedName("trilhaCVV1")
  private String trilhaCVV1 = null;
  @SerializedName("trilhaCVV2")
  private String trilhaCVV2 = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCentroCustoConta() {
    return centroCustoConta;
  }
  public void setCentroCustoConta(String centroCustoConta) {
    this.centroCustoConta = centroCustoConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(Date dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressao {\n");
    
    sb.append("  centroCustoConta: ").append(centroCustoConta).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  idBandeira: ").append(idBandeira).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  nomeEmpregador: ").append(nomeEmpregador).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  nomeEmpresaBeneficio: ").append(nomeEmpresaBeneficio).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  numeroContaCorente: ").append(numeroContaCorente).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  trilha1: ").append(trilha1).append("\n");
    sb.append("  trilha2: ").append(trilha2).append("\n");
    sb.append("  trilhaCVV1: ").append(trilhaCVV1).append("\n");
    sb.append("  trilhaCVV2: ").append(trilhaCVV2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



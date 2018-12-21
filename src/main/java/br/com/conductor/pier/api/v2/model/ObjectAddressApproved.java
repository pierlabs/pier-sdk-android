package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ObjectAddressApproved  {
  
  @SerializedName("idTipoEndereco")
  private Long idTipoEndereco = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("logradouro")
  private String logradouro = null;
  @SerializedName("numero")
  private Integer numero = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("pontoReferencia")
  private String pontoReferencia = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("enderecoCorrespondencia")
  private Boolean enderecoCorrespondencia = null;
  @SerializedName("tempoResidenciaAnos")
  private Integer tempoResidenciaAnos = null;
  @SerializedName("tempoResidenciaMeses")
  private Integer tempoResidenciaMeses = null;

  
  /**
   * Identification Code of the Address (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Address (id)")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * CEP
   **/
  @ApiModelProperty(value = "CEP")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * show the name of the street
   **/
  @ApiModelProperty(value = "show the name of the street")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * Show the address name
   **/
  @ApiModelProperty(value = "Show the address name")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Show complementary descriptions referring to the address
   **/
  @ApiModelProperty(value = "Show complementary descriptions referring to the address")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Show the description of the address landmark
   **/
  @ApiModelProperty(value = "Show the description of the address landmark")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * Show the name of the neighborhood
   **/
  @ApiModelProperty(value = "Show the name of the neighborhood")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Show the name of the city
   **/
  @ApiModelProperty(required = true, value = "Show the name of the city")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Show the acronym of the Federal Unity
   **/
  @ApiModelProperty(required = true, value = "Show the acronym of the Federal Unity")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Show the name of the country
   **/
  @ApiModelProperty(value = "Show the name of the country")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Indicate if the informed address is for the mail
   **/
  @ApiModelProperty(required = true, value = "Indicate if the informed address is for the mail")
  public Boolean getEnderecoCorrespondencia() {
    return enderecoCorrespondencia;
  }
  public void setEnderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
  }

  
  /**
   * Displays the residence time in years
   **/
  @ApiModelProperty(value = "Displays the residence time in years")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * Displays the residence time in months
   **/
  @ApiModelProperty(value = "Displays the residence time in months")
  public Integer getTempoResidenciaMeses() {
    return tempoResidenciaMeses;
  }
  public void setTempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectAddressApproved {\n");
    
    sb.append("  idTipoEndereco: ").append(idTipoEndereco).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  logradouro: ").append(logradouro).append("\n");
    sb.append("  numero: ").append(numero).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  pontoReferencia: ").append(pontoReferencia).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  enderecoCorrespondencia: ").append(enderecoCorrespondencia).append("\n");
    sb.append("  tempoResidenciaAnos: ").append(tempoResidenciaAnos).append("\n");
    sb.append("  tempoResidenciaMeses: ").append(tempoResidenciaMeses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

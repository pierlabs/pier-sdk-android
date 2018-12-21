package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Address
 **/
@ApiModel(description = "Object Address")
public class EnderecoResponse  {
  
  @SerializedName("tempoResidenciaAnos")
  private Integer tempoResidenciaAnos = null;
  @SerializedName("tempoResidenciaMeses")
  private Integer tempoResidenciaMeses = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
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
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataUltimaAtualizacao")
  private String dataUltimaAtualizacao = null;
  @SerializedName("flagCorrespondencia")
  private Boolean flagCorrespondencia = null;

  
  /**
   * Displays the number of years spent living in the residence
   **/
  @ApiModelProperty(value = "Displays the number of years spent living in the residence")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * Displays the number of months spent living in the residence
   **/
  @ApiModelProperty(value = "Displays the number of months spent living in the residence")
  public Integer getTempoResidenciaMeses() {
    return tempoResidenciaMeses;
  }
  public void setTempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
  }

  
  /**
   * Identification Code of the address (id)
   **/
  @ApiModelProperty(value = "Identification Code of the address (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Person which the address belongs (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Person which the address belongs (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification Code of the address (id)
   **/
  @ApiModelProperty(value = "Identification Code of the address (id)")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Show the Zipcode in format '58800000'
   **/
  @ApiModelProperty(value = "Show the Zipcode in format '58800000'")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Show the name of the Street
   **/
  @ApiModelProperty(value = "Show the name of the Street")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * Show the address number
   **/
  @ApiModelProperty(value = "Show the address number")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Show the complementary descriptions referring to the address
   **/
  @ApiModelProperty(value = "Show the complementary descriptions referring to the address")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Show the description of the landmark
   **/
  @ApiModelProperty(value = "Show the description of the landmark")
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
  @ApiModelProperty(value = "Show the name of the city")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Show the acronym of the Federal Unity
   **/
  @ApiModelProperty(value = "Show the acronym of the Federal Unity")
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
   * Show the date tat was registered the address
   **/
  @ApiModelProperty(value = "Show the date tat was registered the address")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Date that was made the last update in this address. When there isn't change, it will have the same information that the field dateInclusion
   **/
  @ApiModelProperty(value = "Date that was made the last update in this address. When there isn't change, it will have the same information that the field dateInclusion")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }

  
  /**
   * Displays the flag that informs if the address is the correspondence
   **/
  @ApiModelProperty(value = "Displays the flag that informs if the address is the correspondence")
  public Boolean getFlagCorrespondencia() {
    return flagCorrespondencia;
  }
  public void setFlagCorrespondencia(Boolean flagCorrespondencia) {
    this.flagCorrespondencia = flagCorrespondencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoResponse {\n");
    
    sb.append("  tempoResidenciaAnos: ").append(tempoResidenciaAnos).append("\n");
    sb.append("  tempoResidenciaMeses: ").append(tempoResidenciaMeses).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
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
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataUltimaAtualizacao: ").append(dataUltimaAtualizacao).append("\n");
    sb.append("  flagCorrespondencia: ").append(flagCorrespondencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

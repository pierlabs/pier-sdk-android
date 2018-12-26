package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ObjetoEndereoAprovadoPersist  {
  
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
   * C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP)
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP)")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Apresenta o nome do Logradouro
   **/
  @ApiModelProperty(value = "Apresenta o nome do Logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * Apresenta o n\u00FAmero do endere\u00E7o
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero do endere\u00E7o")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   **/
  @ApiModelProperty(value = "Apresenta descri\u00E7oes complementares referente ao endere\u00E7o")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   **/
  @ApiModelProperty(value = "Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * Apresenta nome do bairro
   **/
  @ApiModelProperty(value = "Apresenta nome do bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Apresenta nome da cidade
   **/
  @ApiModelProperty(required = true, value = "Apresenta nome da cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Apresenta sigla da Unidade Federativa
   **/
  @ApiModelProperty(required = true, value = "Apresenta sigla da Unidade Federativa")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Apresenta nome do Pa\u00EDs
   **/
  @ApiModelProperty(value = "Apresenta nome do Pa\u00EDs")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Indica se o endere\u00E7o informado \u00E9 o de correspond\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Indica se o endere\u00E7o informado \u00E9 o de correspond\u00EAncia")
  public Boolean getEnderecoCorrespondencia() {
    return enderecoCorrespondencia;
  }
  public void setEnderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
  }

  
  /**
   * Apresenta o tempo de resid\u00EAncia em anos
   **/
  @ApiModelProperty(value = "Apresenta o tempo de resid\u00EAncia em anos")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * Apresenta o tempo de resid\u00EAncia em meses
   **/
  @ApiModelProperty(value = "Apresenta o tempo de resid\u00EAncia em meses")
  public Integer getTempoResidenciaMeses() {
    return tempoResidenciaMeses;
  }
  public void setTempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetoEndereoAprovadoPersist {\n");
    
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

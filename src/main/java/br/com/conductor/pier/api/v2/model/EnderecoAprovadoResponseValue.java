package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class EnderecoAprovadoResponseValue  {
  
  @SerializedName("id")
  private Long id = null;
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
   * {{{endereco_aprovado_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{endereco_aprovado_response_id_tipo_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_id_tipo_endereco_value}}}")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{endereco_aprovado_response_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{endereco_aprovado_response_logradouro_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_logradouro_value}}}")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{endereco_aprovado_response_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_numero_value}}}")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * {{{endereco_aprovado_response_complemento_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_complemento_value}}}")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{endereco_aprovado_response_ponto_referencia_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_ponto_referencia_value}}}")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * {{{endereco_aprovado_response_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{endereco_aprovado_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{endereco_aprovado_response_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{endereco_aprovado_response_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_pais_value}}}")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{endereco_aprovado_response_endereco_correspondencia_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_endereco_correspondencia_value}}}")
  public Boolean getEnderecoCorrespondencia() {
    return enderecoCorrespondencia;
  }
  public void setEnderecoCorrespondencia(Boolean enderecoCorrespondencia) {
    this.enderecoCorrespondencia = enderecoCorrespondencia;
  }

  
  /**
   * {{{endereco_aprovado_response_tempo_Residencia_Anos_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_tempo_Residencia_Anos_value}}}")
  public Integer getTempoResidenciaAnos() {
    return tempoResidenciaAnos;
  }
  public void setTempoResidenciaAnos(Integer tempoResidenciaAnos) {
    this.tempoResidenciaAnos = tempoResidenciaAnos;
  }

  
  /**
   * {{{endereco_aprovado_response_tempo_Residencia_Meses_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_aprovado_response_tempo_Residencia_Meses_value}}}")
  public Integer getTempoResidenciaMeses() {
    return tempoResidenciaMeses;
  }
  public void setTempoResidenciaMeses(Integer tempoResidenciaMeses) {
    this.tempoResidenciaMeses = tempoResidenciaMeses;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoAprovadoResponseValue {\n");
    
    sb.append("  id: ").append(id).append("\n");
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

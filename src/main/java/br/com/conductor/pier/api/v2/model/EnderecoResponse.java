package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{endereco_response_description}}}
 **/
@ApiModel(description = "{{{endereco_response_description}}}")
public class EnderecoResponse  {
  
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
   * {{{endereco_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{endereco_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{endereco_response_id_tipo_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_id_tipo_endereco_value}}}")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{endereco_response_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{endereco_response_logradouro_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_logradouro_value}}}")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{endereco_response_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_numero_value}}}")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * {{{endereco_response_complemento_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_complemento_value}}}")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{endereco_response_ponto_referencia_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_ponto_referencia_value}}}")
  public String getPontoReferencia() {
    return pontoReferencia;
  }
  public void setPontoReferencia(String pontoReferencia) {
    this.pontoReferencia = pontoReferencia;
  }

  
  /**
   * {{{endereco_response_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{endereco_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{endereco_response_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{endereco_response_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_pais_value}}}")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{endereco_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{endereco_response_data_ultima_atualizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_data_ultima_atualizacao_value}}}")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }

  
  /**
   * {{{endereco_response_flag_correspondencia_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_flag_correspondencia_value}}}")
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



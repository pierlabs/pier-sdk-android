package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Endere\u00E7o
 **/
@ApiModel(description = "Objeto Endere\u00E7o")
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

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'")
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
  @ApiModelProperty(value = "Apresenta nome da cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Apresenta sigla da Unidade Federativa
   **/
  @ApiModelProperty(value = "Apresenta sigla da Unidade Federativa")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Apresenta nome do Pais
   **/
  @ApiModelProperty(value = "Apresenta nome do Pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Apresenta a data em que fora cadastrado o Endere\u00E7o
   **/
  @ApiModelProperty(value = "Apresenta a data em que fora cadastrado o Endere\u00E7o")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data em que fora realizada a \u00FAltima mudan\u00E7a neste registro de endere\u00E7o. Quando n\u00E3o tiver ocorrido mudan\u00E7a, conter\u00E1 a mesma informa\u00E7\u00E3o que o campo dataInclusao
   **/
  @ApiModelProperty(value = "Data em que fora realizada a \u00FAltima mudan\u00E7a neste registro de endere\u00E7o. Quando n\u00E3o tiver ocorrido mudan\u00E7a, conter\u00E1 a mesma informa\u00E7\u00E3o que o campo dataInclusao")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
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
    sb.append("}\n");
    return sb.toString();
  }
}

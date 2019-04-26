package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response da lista de hist\u00F3rico altera\u00E7\u00E3o de endere\u00E7o
 **/
@ApiModel(description = "Objeto Response da lista de hist\u00F3rico altera\u00E7\u00E3o de endere\u00E7o")
public class HistoricoEnderecoResponse  {
  
  @SerializedName("dataUltimaAtualizacao")
  private String dataUltimaAtualizacao = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeLogradouroAnterior")
  private String nomeLogradouroAnterior = null;
  @SerializedName("ufAnterior")
  private String ufAnterior = null;
  @SerializedName("cidadeAnterior")
  private String cidadeAnterior = null;
  @SerializedName("cepAnterior")
  private String cepAnterior = null;
  @SerializedName("numeroAnterior")
  private Integer numeroAnterior = null;
  @SerializedName("complementoAnterior")
  private String complementoAnterior = null;
  @SerializedName("tipoEnderecoAnterior")
  private String tipoEnderecoAnterior = null;
  @SerializedName("dataInclusaoAnterior")
  private String dataInclusaoAnterior = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("numero")
  private Integer numero = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("tipoEndereco")
  private String tipoEndereco = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("alteracaoAplicativo")
  private String alteracaoAplicativo = null;

  
  /**
   * Data de \u00FAltima altera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data de \u00FAltima altera\u00E7\u00E3o")
  public String getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }
  public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }

  
  /**
   * Cpf
   **/
  @ApiModelProperty(value = "Cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nome da pessoa
   **/
  @ApiModelProperty(value = "Nome da pessoa")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do logradouro do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Nome do logradouro do endere\u00E7o antigo")
  public String getNomeLogradouroAnterior() {
    return nomeLogradouroAnterior;
  }
  public void setNomeLogradouroAnterior(String nomeLogradouroAnterior) {
    this.nomeLogradouroAnterior = nomeLogradouroAnterior;
  }

  
  /**
   * Estado do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Estado do endere\u00E7o antigo")
  public String getUfAnterior() {
    return ufAnterior;
  }
  public void setUfAnterior(String ufAnterior) {
    this.ufAnterior = ufAnterior;
  }

  
  /**
   * Cidade do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Cidade do endere\u00E7o antigo")
  public String getCidadeAnterior() {
    return cidadeAnterior;
  }
  public void setCidadeAnterior(String cidadeAnterior) {
    this.cidadeAnterior = cidadeAnterior;
  }

  
  /**
   * Cep do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Cep do endere\u00E7o antigo")
  public String getCepAnterior() {
    return cepAnterior;
  }
  public void setCepAnterior(String cepAnterior) {
    this.cepAnterior = cepAnterior;
  }

  
  /**
   * N\u00FAmero do logradouro do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "N\u00FAmero do logradouro do endere\u00E7o antigo")
  public Integer getNumeroAnterior() {
    return numeroAnterior;
  }
  public void setNumeroAnterior(Integer numeroAnterior) {
    this.numeroAnterior = numeroAnterior;
  }

  
  /**
   * Complemento do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Complemento do endere\u00E7o antigo")
  public String getComplementoAnterior() {
    return complementoAnterior;
  }
  public void setComplementoAnterior(String complementoAnterior) {
    this.complementoAnterior = complementoAnterior;
  }

  
  /**
   * Tipo de endere\u00E7o do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Tipo de endere\u00E7o do endere\u00E7o antigo")
  public String getTipoEnderecoAnterior() {
    return tipoEnderecoAnterior;
  }
  public void setTipoEnderecoAnterior(String tipoEnderecoAnterior) {
    this.tipoEnderecoAnterior = tipoEnderecoAnterior;
  }

  
  /**
   * Data de inclus\u00E3o do endere\u00E7o antigo
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o do endere\u00E7o antigo")
  public String getDataInclusaoAnterior() {
    return dataInclusaoAnterior;
  }
  public void setDataInclusaoAnterior(String dataInclusaoAnterior) {
    this.dataInclusaoAnterior = dataInclusaoAnterior;
  }

  
  /**
   * Nome do logradouro do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Nome do logradouro do endere\u00E7o novo")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * Estado do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Estado do endere\u00E7o novo")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Cidade do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Cidade do endere\u00E7o novo")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Cep do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Cep do endere\u00E7o novo")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * N\u00FAmero do logradouro do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "N\u00FAmero do logradouro do endere\u00E7o novo")
  public Integer getNumero() {
    return numero;
  }
  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  
  /**
   * Complemento do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Complemento do endere\u00E7o novo")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Tipo de endere\u00E7o do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Tipo de endere\u00E7o do endere\u00E7o novo")
  public String getTipoEndereco() {
    return tipoEndereco;
  }
  public void setTipoEndereco(String tipoEndereco) {
    this.tipoEndereco = tipoEndereco;
  }

  
  /**
   * Data de inclus\u00E3o do endere\u00E7o novo
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o do endere\u00E7o novo")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Aplicativo respons\u00E1vel pela altera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Aplicativo respons\u00E1vel pela altera\u00E7\u00E3o")
  public String getAlteracaoAplicativo() {
    return alteracaoAplicativo;
  }
  public void setAlteracaoAplicativo(String alteracaoAplicativo) {
    this.alteracaoAplicativo = alteracaoAplicativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoEnderecoResponse {\n");
    
    sb.append("  dataUltimaAtualizacao: ").append(dataUltimaAtualizacao).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeLogradouroAnterior: ").append(nomeLogradouroAnterior).append("\n");
    sb.append("  ufAnterior: ").append(ufAnterior).append("\n");
    sb.append("  cidadeAnterior: ").append(cidadeAnterior).append("\n");
    sb.append("  cepAnterior: ").append(cepAnterior).append("\n");
    sb.append("  numeroAnterior: ").append(numeroAnterior).append("\n");
    sb.append("  complementoAnterior: ").append(complementoAnterior).append("\n");
    sb.append("  tipoEnderecoAnterior: ").append(tipoEnderecoAnterior).append("\n");
    sb.append("  dataInclusaoAnterior: ").append(dataInclusaoAnterior).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  numero: ").append(numero).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  tipoEndereco: ").append(tipoEndereco).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  alteracaoAplicativo: ").append(alteracaoAplicativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

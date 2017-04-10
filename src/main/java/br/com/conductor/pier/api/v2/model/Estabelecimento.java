package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Estabelecimento
 **/
@ApiModel(description = "Objeto Estabelecimento")
public class Estabelecimento  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("numeroEstabelecimento")
  private String numeroEstabelecimento = null;
  @SerializedName("numeroReceitaFederal")
  private Long numeroReceitaFederal = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private String numeroEndereco = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("dataCadastramento")
  private Date dataCadastramento = null;
  @SerializedName("obs")
  private String obs = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("flagArquivoSecrFazenda")
  private Integer flagArquivoSecrFazenda = null;
  @SerializedName("flagCartaoDigitado")
  private Integer flagCartaoDigitado = null;
  @SerializedName("inativo")
  private Integer inativo = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Conductor, com dois d\u00C3\u00ADgitos.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Conductor, com dois d\u00C3\u00ADgitos.")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.
   **/
  @ApiModelProperty(value = "Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.")
  public Long getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(Long numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Nome do Estabelecimento.
   **/
  @ApiModelProperty(value = "Nome do Estabelecimento.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Raz\u00C3\u00A3o Social do Estabelecimento.
   **/
  @ApiModelProperty(value = "Raz\u00C3\u00A3o Social do Estabelecimento.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * T\u00C3\u00ADtulo Comercial do Estabelecimento.
   **/
  @ApiModelProperty(value = "T\u00C3\u00ADtulo Comercial do Estabelecimento.")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Nome do Logradouro.
   **/
  @ApiModelProperty(value = "Nome do Logradouro.")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do endere\u00C3\u00A7o.")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Nome do bairro do endere\u00C3\u00A7o.
   **/
  @ApiModelProperty(value = "Nome do bairro do endere\u00C3\u00A7o.")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Nome da cidade do endere\u00C3\u00A7o.
   **/
  @ApiModelProperty(value = "Nome da cidade do endere\u00C3\u00A7o.")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   **/
  @ApiModelProperty(value = "Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Nome do pa\u00C3\u00ADs.
   **/
  @ApiModelProperty(value = "Nome do pa\u00C3\u00ADs.")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Data de Cadastro do Estabelecimento.
   **/
  @ApiModelProperty(value = "Data de Cadastro do Estabelecimento.")
  public Date getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(Date dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * Detalhes espec\u00C3\u00ADficos quanto ao Cadastro do Estabelecimento.
   **/
  @ApiModelProperty(value = "Detalhes espec\u00C3\u00ADficos quanto ao Cadastro do Estabelecimento.")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * Nome da pessoa para contato com o Estabelecimento.
   **/
  @ApiModelProperty(value = "Nome da pessoa para contato com o Estabelecimento.")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * E-mail da pessoa para contato com o Estabelecimento.
   **/
  @ApiModelProperty(value = "E-mail da pessoa para contato com o Estabelecimento.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   **/
  @ApiModelProperty(value = "Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indica se o estabelecimento est\u00C3\u00A1 inativo.
   **/
  @ApiModelProperty(value = "Indica se o estabelecimento est\u00C3\u00A1 inativo.")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Estabelecimento {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  dataCadastramento: ").append(dataCadastramento).append("\n");
    sb.append("  obs: ").append(obs).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagArquivoSecrFazenda: ").append(flagArquivoSecrFazenda).append("\n");
    sb.append("  flagCartaoDigitado: ").append(flagCartaoDigitado).append("\n");
    sb.append("  inativo: ").append(inativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



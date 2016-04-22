package br.com.conductor.caas.api.v1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class PessoaFisicaResponse  {
  
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("complementoLogradouro")
  private String complementoLogradouro = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("dddcelular")
  private String dddcelular = null;
  @SerializedName("dddtelefone")
  private String dddtelefone = null;
  @SerializedName("endereco")
  private String endereco = null;
  @SerializedName("idPessoaFisica")
  private Integer idPessoaFisica = null;
  @SerializedName("identidade")
  private String identidade = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("numeroCelular")
  private String numeroCelular = null;
  @SerializedName("numeroLogradouro")
  private Integer numeroLogradouro = null;
  @SerializedName("numeroTelefone")
  private String numeroTelefone = null;
  @SerializedName("orgaoEmissor")
  private String orgaoEmissor = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("uf")
  private String uf = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getComplementoLogradouro() {
    return complementoLogradouro;
  }
  public void setComplementoLogradouro(String complementoLogradouro) {
    this.complementoLogradouro = complementoLogradouro;
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
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDddcelular() {
    return dddcelular;
  }
  public void setDddcelular(String dddcelular) {
    this.dddcelular = dddcelular;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDddtelefone() {
    return dddtelefone;
  }
  public void setDddtelefone(String dddtelefone) {
    this.dddtelefone = dddtelefone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Integer idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getIdentidade() {
    return identidade;
  }
  public void setIdentidade(String identidade) {
    this.identidade = identidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumeroLogradouro() {
    return numeroLogradouro;
  }
  public void setNumeroLogradouro(Integer numeroLogradouro) {
    this.numeroLogradouro = numeroLogradouro;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroTelefone() {
    return numeroTelefone;
  }
  public void setNumeroTelefone(String numeroTelefone) {
    this.numeroTelefone = numeroTelefone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrgaoEmissor() {
    return orgaoEmissor;
  }
  public void setOrgaoEmissor(String orgaoEmissor) {
    this.orgaoEmissor = orgaoEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaResponse {\n");
    
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  complementoLogradouro: ").append(complementoLogradouro).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  dddcelular: ").append(dddcelular).append("\n");
    sb.append("  dddtelefone: ").append(dddtelefone).append("\n");
    sb.append("  endereco: ").append(endereco).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("  identidade: ").append(identidade).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  numeroCelular: ").append(numeroCelular).append("\n");
    sb.append("  numeroLogradouro: ").append(numeroLogradouro).append("\n");
    sb.append("  numeroTelefone: ").append(numeroTelefone).append("\n");
    sb.append("  orgaoEmissor: ").append(orgaoEmissor).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



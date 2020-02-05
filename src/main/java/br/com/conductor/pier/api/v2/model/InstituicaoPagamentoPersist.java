package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InstituicaoPagamentoPersist  {
  
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("codigoMunicipio")
  private String codigoMunicipio = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("endereco")
  private String endereco = null;
  @SerializedName("fone")
  private String fone = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("nomeResponsavel")
  private String nomeResponsavel = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("ufFisco")
  private String ufFisco = null;

  
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
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoMunicipio() {
    return codigoMunicipio;
  }
  public void setCodigoMunicipio(String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  public String getFone() {
    return fone;
  }
  public void setFone(String fone) {
    this.fone = fone;
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
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeResponsavel() {
    return nomeResponsavel;
  }
  public void setNomeResponsavel(String nomeResponsavel) {
    this.nomeResponsavel = nomeResponsavel;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUfFisco() {
    return ufFisco;
  }
  public void setUfFisco(String ufFisco) {
    this.ufFisco = ufFisco;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstituicaoPagamentoPersist {\n");
    
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  codigoMunicipio: ").append(codigoMunicipio).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  endereco: ").append(endereco).append("\n");
    sb.append("  fone: ").append(fone).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  nomeResponsavel: ").append(nomeResponsavel).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  ufFisco: ").append(ufFisco).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

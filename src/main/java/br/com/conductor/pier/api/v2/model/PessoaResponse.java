package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Person
 **/
@ApiModel(description = "Person")
public class PessoaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("tipo")
  private String tipo = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;

  
  /**
   * Identification Code of the Person (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Person (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the 'Full name of the PP' or the ' Full name of the social reason (Business name)'
   **/
  @ApiModelProperty(required = true, value = "Show the 'Full name of the PP' or the ' Full name of the social reason (Business name)'")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identification Code of the Person type, being ('PP': Physical Person), ('PJ': Legal Person)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Person type, being ('PP': Physical Person), ('PJ': Legal Person)")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * CPF number, when it is PP
   **/
  @ApiModelProperty(value = "CPF number, when it is PP")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * CNPJ number, when it is LP
   **/
  @ApiModelProperty(value = "CNPJ number, when it is LP")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Birth date of the person, when it is PP, or the date of the Company Opening, when it is LP
   **/
  @ApiModelProperty(value = "Birth date of the person, when it is PP, or the date of the Company Opening, when it is LP")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Identity Number
   **/
  @ApiModelProperty(value = "Identity Number")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Issuer Organ of the ID
   **/
  @ApiModelProperty(value = "Issuer Organ of the ID")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Identification Code of the Person sex, being: ('M': Male), ('F': Female), ('O': Other), ('N': Not Specified)
   **/
  @ApiModelProperty(value = "Identification Code of the Person sex, being: ('M': Male), ('F': Female), ('O': Other), ('N': Not Specified)")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * Acronym of the Federal Unity where was issued the Identity
   **/
  @ApiModelProperty(value = "Acronym of the Federal Unity where was issued the Identity")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Issue date of the identity in the format yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Issue date of the identity in the format yyyy-MM-dd")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  tipo: ").append(tipo).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

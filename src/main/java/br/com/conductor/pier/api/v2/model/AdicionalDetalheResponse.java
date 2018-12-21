package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response of the additional detail register resource
 **/
@ApiModel(description = "Response of the additional detail register resource")
public class AdicionalDetalheResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private Long idProfissao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("dataCadastroPortador")
  private String dataCadastroPortador = null;
  @SerializedName("dataCancelamentoPortador")
  private String dataCancelamentoPortador = null;
  @SerializedName("telefones")
  private List<TelefoneResponse> telefones = null;

  
  /**
   * Identification Code of the account for the register of the additional
   **/
  @ApiModelProperty(value = "Identification Code of the account for the register of the additional")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Additional Person
   **/
  @ApiModelProperty(value = "Identification Code of the Additional Person")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Additional Full name
   **/
  @ApiModelProperty(value = "Additional Full name")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Name of the Additional that will be recorded on the card
   **/
  @ApiModelProperty(value = "Name of the Additional that will be recorded on the card")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Number of CPF or CNPJ of the Additional
   **/
  @ApiModelProperty(value = "Number of CPF or CNPJ of the Additional")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Birth date of the Additional
   **/
  @ApiModelProperty(value = "Birth date of the Additional")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Identification Code of the person sex, when PP, being: ('M': Male), ('F': Female), ('O': Other), ('N': Not specified)
   **/
  @ApiModelProperty(value = "Identification Code of the person sex, when PP, being: ('M': Male), ('F': Female), ('O': Other), ('N': Not specified)")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * Number of the Identity Document of the Additional
   **/
  @ApiModelProperty(value = "Number of the Identity Document of the Additional")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Name of the Consignor Organ of the Identity of the Additional
   **/
  @ApiModelProperty(value = "Name of the Consignor Organ of the Identity of the Additional")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Acronym of the Federal Unity where the Identity document of the Additional was issued
   **/
  @ApiModelProperty(value = "Acronym of the Federal Unity where the Identity document of the Additional was issued")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Date of issue of the Identity document of the Additional
   **/
  @ApiModelProperty(value = "Date of issue of the Identity document of the Additional")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Identification Code of Marital Status of the Additional
   **/
  @ApiModelProperty(value = "Identification Code of Marital Status of the Additional")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Identification Code of the Occupation of Additional
   **/
  @ApiModelProperty(value = "Identification Code of the Occupation of Additional")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Identification Code of the Additional Nationality
   **/
  @ApiModelProperty(value = "Identification Code of the Additional Nationality")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * Identification Code of parantage of the Additional with the holder
   **/
  @ApiModelProperty(value = "Identification Code of parantage of the Additional with the holder")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Identification Code of Kinship of the Additional with the holder
   **/
  @ApiModelProperty(value = "Identification Code of Kinship of the Additional with the holder")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indicate if the additional is active =1 or inactive =0
   **/
  @ApiModelProperty(value = "Indicate if the additional is active =1 or inactive =0")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Indicate the date of the additional register
   **/
  @ApiModelProperty(value = "Indicate the date of the additional register")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Indicate the date of cancellation of the additional
   **/
  @ApiModelProperty(value = "Indicate the date of cancellation of the additional")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  
  /**
   * List of the additional telephones
   **/
  @ApiModelProperty(value = "List of the additional telephones")
  public List<TelefoneResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalDetalheResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("  dataCancelamentoPortador: ").append(dataCancelamentoPortador).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

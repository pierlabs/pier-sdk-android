package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{pessoa_response_description}}}
 **/
@ApiModel(description = "{{{pessoa_response_description}}}")
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
   * {{{pessoa_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pessoa_response_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{pessoa_response_tipo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_response_tipo_value}}}")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * {{{pessoa_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{pessoa_response_cnpj_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_cnpj_value}}}")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * {{{pessoa_response_data_nascimento_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_data_nascimento_value}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{pessoa_response_numero_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_numero_identidade_value}}}")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{pessoa_response_orgao_expedidor_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_orgao_expedidor_identidade_value}}}")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{pessoa_response_sexo_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_sexo_value}}}")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{pessoa_response_unidade_federativa_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_unidade_federativa_identidade_value}}}")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{pessoa_response_data_emissao_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_response_data_emissao_identidade_value}}}")
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



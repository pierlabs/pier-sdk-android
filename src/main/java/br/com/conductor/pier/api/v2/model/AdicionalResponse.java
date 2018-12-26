package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{adicional_response_description}}}
 **/
@ApiModel(description = "{{{adicional_response_description}}}")
public class AdicionalResponse  {
  
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
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("dataCadastroPortador")
  private String dataCadastroPortador = null;
  @SerializedName("dataCancelamentoPortador")
  private String dataCancelamentoPortador = null;

  
  /**
   * {{{adicional_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{adicional_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{adicional_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{adicional_response_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{adicional_response_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_numero_receita_federal_value}}}")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{adicional_response_data_nascimento_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_data_nascimento_value}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{adicional_response_sexo_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_sexo_value}}}")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{adicional_response_numero_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_numero_identidade_value}}}")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{adicional_response_orgao_expedidor_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_orgao_expedidor_identidade_value}}}")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{adicional_response_unidade_federativa_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_unidade_federativa_identidade_value}}}")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{adicional_response_data_emissao_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_data_emissao_identidade_value}}}")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{adicional_response_id_parentesco_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_id_parentesco_value}}}")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * {{{adicional_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_flag_ativo_value}}}")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{adicional_response_data_cadastro_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_data_cadastro_portador_value}}}")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * {{{adicional_response_data_cancelamento_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_response_data_cancelamento_portador_value}}}")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalResponse {\n");
    
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
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("  dataCancelamentoPortador: ").append(dataCancelamentoPortador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

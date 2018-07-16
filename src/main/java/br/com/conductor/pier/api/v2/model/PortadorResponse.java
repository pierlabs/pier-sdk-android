package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{portador_response_description}}}
 **/
@ApiModel(description = "{{{portador_response_description}}}")
public class PortadorResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("dataCadastroPortador")
  private String dataCadastroPortador = null;
  @SerializedName("dataCancelamentoPortador")
  private String dataCancelamentoPortador = null;

  
  /**
   * {{{portador_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{portador_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{portador_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{portador_response_id_parentesco_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_id_parentesco_value}}}")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * {{{portador_response_tipo_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_tipo_portador_value}}}")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * {{{portador_response_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{portador_response_id_tipo_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_id_tipo_cartao_value}}}")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{portador_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_flag_ativo_value}}}")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{portador_response_data_cadastro_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_data_cadastro_portador_value}}}")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * {{{portador_response_data_cancelamento_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{portador_response_data_cancelamento_portador_value}}}")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("  dataCancelamentoPortador: ").append(dataCancelamentoPortador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



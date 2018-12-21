package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{consulta_cadastro_estabelecimento_d_t_o_description}}}
 **/
@ApiModel(description = "{{{consulta_cadastro_estabelecimento_d_t_o_description}}}")
public class ConsultaCadastroEstabelecimentoDTO  {
  
  @SerializedName("dataHoraConsulta")
  private String dataHoraConsulta = null;
  public enum StatusEnum {
     OK,  NOK, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  public enum TipoEntidadeEnum {
     ATIVO,  BLOQUEADO, 
  };
  @SerializedName("tipoEntidade")
  private TipoEntidadeEnum tipoEntidade = null;

  
  /**
   * {{{consulta_cadastro_estabelecimento_d_t_o_data_hora_consulta_value}}}
   **/
  @ApiModelProperty(value = "{{{consulta_cadastro_estabelecimento_d_t_o_data_hora_consulta_value}}}")
  public String getDataHoraConsulta() {
    return dataHoraConsulta;
  }
  public void setDataHoraConsulta(String dataHoraConsulta) {
    this.dataHoraConsulta = dataHoraConsulta;
  }

  
  /**
   * {{{consulta_cadastro_estabelecimento_d_t_o_status_value}}}
   **/
  @ApiModelProperty(value = "{{{consulta_cadastro_estabelecimento_d_t_o_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{consulta_cadastro_estabelecimento_d_t_o_tipo_entidade_value}}}
   **/
  @ApiModelProperty(value = "{{{consulta_cadastro_estabelecimento_d_t_o_tipo_entidade_value}}}")
  public TipoEntidadeEnum getTipoEntidade() {
    return tipoEntidade;
  }
  public void setTipoEntidade(TipoEntidadeEnum tipoEntidade) {
    this.tipoEntidade = tipoEntidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaCadastroEstabelecimentoDTO {\n");
    
    sb.append("  dataHoraConsulta: ").append(dataHoraConsulta).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  tipoEntidade: ").append(tipoEntidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{maquineta_persist_description}}}
 **/
@ApiModel(description = "{{{maquineta_persist_description}}}")
public class MaquinetaPersist  {
  
  @SerializedName("idTerminal")
  private Long idTerminal = null;
  @SerializedName("idTipoMaquineta")
  private Long idTipoMaquineta = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataHoraImplantacao")
  private String dataHoraImplantacao = null;

  
  /**
   * {{{maquineta_persist_id_terminal_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{maquineta_persist_id_terminal_value}}}")
  public Long getIdTerminal() {
    return idTerminal;
  }
  public void setIdTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
  }

  
  /**
   * {{{maquineta_persist_id_tipo_maquineta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{maquineta_persist_id_tipo_maquineta_value}}}")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * {{{maquineta_persist_valor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{maquineta_persist_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{maquineta_persist_data_hora_implantacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{maquineta_persist_data_hora_implantacao_value}}}")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaPersist {\n");
    
    sb.append("  idTerminal: ").append(idTerminal).append("\n");
    sb.append("  idTipoMaquineta: ").append(idTipoMaquineta).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataHoraImplantacao: ").append(dataHoraImplantacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

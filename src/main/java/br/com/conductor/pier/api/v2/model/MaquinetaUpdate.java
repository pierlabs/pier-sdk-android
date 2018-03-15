package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de requisi\u00E7\u00E3o para alterar Maquineta
 **/
@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o para alterar Maquineta")
public class MaquinetaUpdate  {
  
  @SerializedName("idTerminal")
  private Long idTerminal = null;
  @SerializedName("idTipoMaquineta")
  private Long idTipoMaquineta = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataHoraImplantacao")
  private String dataHoraImplantacao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).")
  public Long getIdTerminal() {
    return idTerminal;
  }
  public void setIdTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Maquineta (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Maquineta (id).")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Valor de Manuten\u00E7\u00E3o da Maquineta.
   **/
  @ApiModelProperty(required = true, value = "Valor de Manuten\u00E7\u00E3o da Maquineta.")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Data da implanta\u00E7\u00E3o da Maquineta.
   **/
  @ApiModelProperty(required = true, value = "Data da implanta\u00E7\u00E3o da Maquineta.")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaUpdate {\n");
    
    sb.append("  idTerminal: ").append(idTerminal).append("\n");
    sb.append("  idTipoMaquineta: ").append(idTipoMaquineta).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataHoraImplantacao: ").append(dataHoraImplantacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

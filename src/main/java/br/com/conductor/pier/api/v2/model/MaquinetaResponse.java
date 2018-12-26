package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{maquineta_response_description}}}
 **/
@ApiModel(description = "{{{maquineta_response_description}}}")
public class MaquinetaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoMaquineta")
  private Long idTipoMaquineta = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataHoraImplantacao")
  private String dataHoraImplantacao = null;
  @SerializedName("dataHoraCadastramento")
  private String dataHoraCadastramento = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("usuarioApl")
  private String usuarioApl = null;

  
  /**
   * {{{maquineta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{maquineta_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{maquineta_response_id_tipo_maquineta_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_id_tipo_maquineta_value}}}")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * {{{maquineta_response_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{maquineta_response_data_hora_implantacao_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_data_hora_implantacao_value}}}")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  
  /**
   * {{{maquineta_response_data_hora_cadastramento_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_data_hora_cadastramento_value}}}")
  public String getDataHoraCadastramento() {
    return dataHoraCadastramento;
  }
  public void setDataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
  }

  
  /**
   * {{{maquineta_response_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_terminal_value}}}")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * {{{maquineta_response_usuario_apl_value}}}
   **/
  @ApiModelProperty(value = "{{{maquineta_response_usuario_apl_value}}}")
  public String getUsuarioApl() {
    return usuarioApl;
  }
  public void setUsuarioApl(String usuarioApl) {
    this.usuarioApl = usuarioApl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoMaquineta: ").append(idTipoMaquineta).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataHoraImplantacao: ").append(dataHoraImplantacao).append("\n");
    sb.append("  dataHoraCadastramento: ").append(dataHoraCadastramento).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  usuarioApl: ").append(usuarioApl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

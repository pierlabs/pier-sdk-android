package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que represensa o response da suspeita de fraude
 **/
@ApiModel(description = "Objeto que represensa o response da suspeita de fraude")
public class SuspeitaFraudeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idMotivoFraude")
  private Long idMotivoFraude = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("dataHoraSuspeitaFraude")
  private String dataHoraSuspeitaFraude = null;
  @SerializedName("dataHoraCriacao")
  private String dataHoraCriacao = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da suspeita de fraude
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da suspeita de fraude")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do motivo da suspeita de fraude
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do motivo da suspeita de fraude")
  public Long getIdMotivoFraude() {
    return idMotivoFraude;
  }
  public void setIdMotivoFraude(Long idMotivoFraude) {
    this.idMotivoFraude = idMotivoFraude;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa com suspeita de fraude
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa com suspeita de fraude")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Data e hora em que foi identificado a suspeita de fraude
   **/
  @ApiModelProperty(value = "Data e hora em que foi identificado a suspeita de fraude")
  public String getDataHoraSuspeitaFraude() {
    return dataHoraSuspeitaFraude;
  }
  public void setDataHoraSuspeitaFraude(String dataHoraSuspeitaFraude) {
    this.dataHoraSuspeitaFraude = dataHoraSuspeitaFraude;
  }

  
  /**
   * Data e hora em que o cadastro foi realizado no PIER
   **/
  @ApiModelProperty(value = "Data e hora em que o cadastro foi realizado no PIER")
  public String getDataHoraCriacao() {
    return dataHoraCriacao;
  }
  public void setDataHoraCriacao(String dataHoraCriacao) {
    this.dataHoraCriacao = dataHoraCriacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspeitaFraudeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idMotivoFraude: ").append(idMotivoFraude).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  dataHoraSuspeitaFraude: ").append(dataHoraSuspeitaFraude).append("\n");
    sb.append("  dataHoraCriacao: ").append(dataHoraCriacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
